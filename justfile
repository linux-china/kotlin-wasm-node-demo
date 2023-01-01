# build the project with Wasm
build:
  ./gradlew wasmMainClasses build

# run Wasm with node
start: build
  ./gradlew wasmNodeProductionRun
