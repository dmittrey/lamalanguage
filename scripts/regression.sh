#!/usr/bin/env bash
set -euo pipefail

root="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"

TEST_DIR="${TEST_DIR:-$root/language/tests/lama/regression}"
LAMA_TRUFFLE="${LAMA_TRUFFLE:-$root/standalone/target/lama}"

if [[ ! -x "$LAMA_TRUFFLE" ]]; then
  echo "error: lama binary not found at $LAMA_TRUFFLE (run: make package)" >&2
  exit 1
fi

if [[ ! -d "$TEST_DIR" ]]; then
  echo "error: test directory not found: $TEST_DIR" >&2
  exit 1
fi

run_test() {
  local test_name="$1"
  cd "$TEST_DIR"
  if [[ -f "$test_name.input" ]]; then
    cat "$test_name.input" | "$LAMA_TRUFFLE" --disable-launcher-output "$test_name.lama" \
      >"$test_name.actual.log" 2>&1
  else
    "$LAMA_TRUFFLE" --disable-launcher-output "$test_name.lama" \
      >"$test_name.actual.log" 2>&1
  fi
}

compare_test() {
  local test_name="$1"
  if diff -q "orig/$test_name.log" "$test_name.actual.log" >/dev/null 2>&1; then
    echo "PASS"
    rm -f "$test_name.actual.log"
    return 0
  fi
  echo "FAIL"
  diff -u "orig/$test_name.log" "$test_name.actual.log" >"$test_name.diff" 2>/dev/null || true
  return 1
}

if [[ -n "${TEST:-}" ]]; then
  test_name="${TEST%.lama}"
  if [[ ! -f "$TEST_DIR/$test_name.lama" ]]; then
    echo "error: test not found: $test_name.lama" >&2
    exit 1
  fi
  printf "Test %s: " "$test_name"
  run_test "$test_name"
  compare_test "$test_name" || exit 1
  exit 0
fi

echo "Running regression tests..."

failed_tests=()
total_tests=0
passed_tests=0

shopt -s nullglob
for lama_file in "$TEST_DIR"/*.lama; do
  test_name="$(basename "$lama_file" .lama)"

  total_tests=$((total_tests + 1))
  printf "Test %s: " "$test_name"
  run_test "$test_name"
  if compare_test "$test_name"; then
    passed_tests=$((passed_tests + 1))
  else
    failed_tests+=("$test_name")
  fi
done

failed_tests_count=${#failed_tests[@]}

echo ""
echo "Test results:"
echo "  Total:  $total_tests"
echo "  Passed: $passed_tests"
echo "  Failed: $failed_tests_count"
echo ""

if [[ $failed_tests_count -gt 0 ]]; then
  echo "Failed tests: ${failed_tests[*]}"
  exit 1
fi

echo "All tests passed!"
