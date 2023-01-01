# build the project with Wasm
build:
  ./gradlew wasmMainClasses build

# run Wasm with node
start: build
  ./gradlew wasmNodeProductionRun

# run by command line
run:
  cd build/js/packages/kotlin-wasm-node-example-wasm/ ; node --experimental-wasm-gc kotlin/kotlin-wasm-node-example-wasm.mjs