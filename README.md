# Lama on Graal Truffle

Lama language interpreter implemented with Graal Truffle (JVM build), based on the
[SimpleLanguage](https://github.com/graalvm/simplelanguage) template and the course reference
implementation.

## Build

```bash
make package
```

## Run

```bash
./lama program.lama
```

Or after `make package`:

```bash
./standalone/target/lama --disable-launcher-output program.lama
```

## Regression tests

```bash
make regression
```

Run a single test:

```bash
make regression-one TEST=test040
```

Tests live in `language/test/regression/` with expected output in `orig/*.log`. **All** regression tests pass (77 tests).

## Performance

```bash
make performance

=== Performance: PERF_TEST=Sort PERF_N=5000 ===
mode                time (ms)
lamac -i           185664.610
lamac -s            46258.170
truffle (cold)       6679.190
```

## Docker

```bash
make docker-build
make docker-shell
```
