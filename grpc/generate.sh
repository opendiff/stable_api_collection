#!/usr/bin/env sh

# work around: Failure: too many remote plugins in a single request: got 12, limit is 10
buf generate --template buf.gen.yaml
buf generate --template buf.gen2.yaml
