# run Wasm with node
start:
  ./gradlew wasmJsNodeRun

# start with production
start-prod:
  ./gradlew wasmJsNodeProductionRun

# run by command line
run:
  cd build/js/packages/kotlin-wasm-node-example-wasm-js/ ; node kotlin/kotlin-wasm-node-example-wasm-js.mjs

# run by deno
deno-run:
  cd build/js/packages/kotlin-wasm-node-example-wasm-js/ ; deno run -A kotlin/kotlin-wasm-node-example-wasm-js.mjs

# run demo.mjs to call exported method from Kotlin Wasm
demo:
  node demo.mjs

# build for release
build:
  ./gradlew build
  ls -al build/js/packages/kotlin-wasm-node-example-wasm-js/kotlin/*.wasm

release:
  ./gradlew compileProductionExecutableKotlinWasmJsOptimize

# clean
clean:
  ./gradlew clean
  rm -rf kotlin-js-store