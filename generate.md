# REST API Generate

```
export PATH=”$HOME/bin/openapitools:$PATH”

export OPENAPI_GENERATOR_VERSION=7.0.0-SNAPSHOT

# work around https://github.com/OpenAPITools/openapi-generator/issues/13684
export JAVA_OPTS="--add-opens java.base/java.util=ALL-UNNAMED --add-opens java.base/java.lang=ALL-UNNAMED"

export LANG=python-experimental; openapi-generator-cli generate -i openapi.json -g "$LANG" -o "./rest/gen/$LANG";
```

# gRPC API Generate

See [./grpc/generate.sh](./grpc/generate.sh)

```
buf registry login
```

```
cd proto
buf push
```

```
buf generate
```

- https://buf.build/plugins
- https://github.com/coreweave/tensorizer/blob/main/proto/tensors.proto
- https://github.com/Stability-AI/api-interfaces/tree/main/src/proto

