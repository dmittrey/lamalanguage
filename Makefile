IMAGE_NAME  ?= lamalanguage-dev
LAMA_DIR     ?= $(PWD)/Lama
TEST_DIR     ?= $(PWD)/language/tests/lama/regression
PERF_DIR     ?= $(LAMA_DIR)/performance
PERF_N       ?= 5000
PERF_TEST    ?= Sort
LAMAC        ?= $(LAMA_DIR)/_build/default/src/Driver.exe
LAMA_TRUFFLE ?= $(PWD)/standalone/target/lama

.PHONY: docker-build docker-shell package regression regression-one performance lamac-build clean

docker-build:
	docker build -t $(IMAGE_NAME) .

docker-shell:
	docker run --rm -it --entrypoint bash -p 8000:8000 -v $(PWD):/workspace $(IMAGE_NAME)

package:
	mvn -q -DskipTests package

lamac-build:
	cd $(LAMA_DIR) && eval $$(opam env) && dune build src runtime

regression: package
	TEST_DIR='$(TEST_DIR)' \
	LAMA_TRUFFLE='$(LAMA_TRUFFLE)' \
	bash scripts/regression.sh

performance: package lamac-build
	LAMA_DIR='$(LAMA_DIR)' \
	PERF_DIR='$(PERF_DIR)' \
	PERF_N='$(PERF_N)' \
	PERF_TEST='$(PERF_TEST)' \
	LAMAC='$(LAMAC)' \
	LAMA_TRUFFLE='$(LAMA_TRUFFLE)' \
	bash scripts/performance.sh

clean:
	@rm -f $(TEST_DIR)/*.actual.log $(TEST_DIR)/*.diff
	@rm -rf $(PERF_DIR)/_run
	@mvn -q clean
