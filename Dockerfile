FROM container-registry.oracle.com/graalvm/native-image:21

ENV MAVEN_VERSION=3.9.16 \
    MAVEN_HOME=/opt/maven \
    MX_HOME=/opt/mx \
    OPAM_VERSION=2.2.1 \
    OPAMROOT=/root/.opam \
    PATH=/root/.opam/lama/bin:/opt/maven/bin:/opt/mx:${PATH} \
    OCAML_TOPLEVEL_PATH=/root/.opam/lama/lib/toplevel

RUN microdnf install -y \
        git \
        python3 \
        curl \
        tar \
        which \
        findutils \
        gcc \
        gcc-c++ \
        make \
        m4 \
        patch \
        unzip \
        bubblewrap \
        diffutils \
        perl \
        perl-Time-HiRes \
        bzip2 \
        pcre2-devel \
        pkgconf-pkg-config \
    && microdnf clean all

RUN curl -fsSL "https://dlcdn.apache.org/maven/maven-3/${MAVEN_VERSION}/binaries/apache-maven-${MAVEN_VERSION}-bin.tar.gz" \
        -o /tmp/apache-maven.tar.gz \
    && tar -xzf /tmp/apache-maven.tar.gz -C /opt \
    && mv "/opt/apache-maven-${MAVEN_VERSION}" "${MAVEN_HOME}" \
    && rm /tmp/apache-maven.tar.gz

RUN git clone --depth 1 https://github.com/graalvm/mx.git "${MX_HOME}"

# OCaml toolchain for reference lamac (Lama/performance benchmarks)
ARG TARGETARCH
RUN case "${TARGETARCH}" in \
      arm64) opam_arch=arm64-linux ;; \
      amd64) opam_arch=x86_64-linux ;; \
      *) echo "unsupported TARGETARCH: ${TARGETARCH}" >&2; exit 1 ;; \
    esac; \
    curl -fsSL "https://github.com/ocaml/opam/releases/download/${OPAM_VERSION}/opam-${OPAM_VERSION}-$opam_arch" \
        -o /usr/local/bin/opam \
    && chmod +x /usr/local/bin/opam \
    && opam init --disable-sandboxing -y --bare \
    && opam switch create lama ocaml-base-compiler.4.14.2 -y

COPY Lama/Lama.opam /tmp/lama-opam/
RUN cd /tmp/lama-opam \
    && opam install . --deps-only --yes --no-depexts \
    && rm -rf /tmp/lama-opam

WORKDIR /workspace

# Base image ENTRYPOINT runs native-image on the command; clear it for a dev shell.
ENTRYPOINT []

CMD ["bash"]
