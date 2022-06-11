#!/usr/bin/env bash

./gradlew build
cd build/js/packages/nodejs-hello-world-wasm/kotlin; ~/.jsvu/v8-9.2.212 --experimental-wasm-typed-funcref --experimental-wasm-gc --experimental-wasm-eh --module ./nodejs-hello-world-wasm.js