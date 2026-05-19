#!/usr/bin/env bash
set -euo pipefail

root="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"

LAMA_DIR="${LAMA_DIR:-$root/Lama}"
PERF_DIR="${PERF_DIR:-$LAMA_DIR/performance}"
PERF_N="${PERF_N:-5000}"
PERF_TEST="${PERF_TEST:-Sort}"
LAMAC="${LAMAC:-$LAMA_DIR/_build/default/src/Driver.exe}"
LAMA_TRUFFLE="${LAMA_TRUFFLE:-$root/standalone/target/lama}"
REPORT_PL="${REPORT_PL:-$root/scripts/performance-report.pl}"

for f in "$PERF_DIR/$PERF_TEST.input" "$PERF_DIR/$PERF_TEST.lama"; do
  if [[ ! -f "$f" ]]; then
    echo "error: missing $f" >&2
    exit 1
  fi
done

if [[ ! -x "$LAMAC" ]]; then
  echo "error: lamac not found at $LAMAC (run: make lamac-build)" >&2
  exit 1
fi

if [[ ! -x "$LAMA_TRUFFLE" ]]; then
  echo "error: lama binary not found at $LAMA_TRUFFLE (run: make package)" >&2
  exit 1
fi

RUN="$PERF_DIR/_run"
rm -rf "$RUN"
mkdir -p "$RUN"

cp "$PERF_DIR/$PERF_TEST.input" "$RUN/$PERF_TEST.input"
sed "s/generate (10000)/generate ($PERF_N)/" \
  "$PERF_DIR/$PERF_TEST.lama" >"$RUN/$PERF_TEST.lama"

RESULTS="$RUN/results.tsv"
SORT="$RUN/$PERF_TEST.lama"
INPUT="$RUN/$PERF_TEST.input"
rm -f "$RESULTS"

measure_ms() {
  local label="$1"
  shift
  local start end ms rc
  start=$(perl -MTime::HiRes=time -e 'print time()')
  (cd "$RUN" && "$@" <"$INPUT") >"$RUN/$label.out" 2>"$RUN/$label.err"
  rc=$?
  end=$(perl -MTime::HiRes=time -e 'print time()')
  ms=$(perl -e 'printf "%.3f", ($ARGV[1]-$ARGV[0])*1000' "$start" "$end")
  printf '%s\t%s\t%s\n' "$label" "$ms" "$rc" >>"$RESULTS"
  return "$rc"
}

echo "Running lamac -i..."
measure_ms lamac_i \
  "$LAMAC" -runtime "$LAMA_DIR/runtime" -I "$LAMA_DIR/stdlib/x64" -i "$SORT"

echo "Running lamac -s..."
measure_ms lamac_s \
  "$LAMAC" -runtime "$LAMA_DIR/runtime" -I "$LAMA_DIR/stdlib/x64" -s "$SORT"

echo "Running truffle (cold)..."
measure_ms truffle \
  "$LAMA_TRUFFLE" -J-Xss32m --disable-launcher-output "$SORT"

exec perl "$REPORT_PL" "$RESULTS" "$PERF_TEST" "$PERF_N"
