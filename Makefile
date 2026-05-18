IMAGE_NAME ?= lamalanguage-dev

.PHONY: docker-build docker-shell

docker-build:
	docker build -t $(IMAGE_NAME) .

docker-shell:
	docker run --rm -it --entrypoint bash -p 8000:8000 -v $(PWD):/workspace $(IMAGE_NAME)
