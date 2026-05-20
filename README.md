# Lama on Graal Truffle

Lama language interpreter implemented with Graal Truffle (JVM build), based on the
[SimpleLanguage](https://github.com/graalvm/simplelanguage) template and the course reference
implementation.

## Prepare

```bash
make docker-build
make docker-shell
```

## Regression tests

```bash
make regression
```

**All** regression tests pass (77 tests).

## Performance

```bash
make performance

=== Performance: PERF_TEST=Sort PERF_N=5000 ===
mode                time (ms)
lamac -i           185664.610
lamac -s            46258.170
truffle (cold)       6679.190
```
