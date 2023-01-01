# run Wasm with node
start:
  ./gradlew wasmNodeRun

# start with production
start-prod:
  ./gradlew wasmNodeProductionRun

# run by command line
run:
  cd build/js/packages/kotlin-wasm-node-example-wasm/ ; node --experimental-wasm-gc kotlin/kotlin-wasm-node-example-wasm.mjs

# build for release
build:
  ./gradlew build