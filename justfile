# run Wasm with node
start:
  ./gradlew wasmJsNodeRun

# start with production
start-prod:
  ./gradlew wasmJsNodeProductionRun

# run by node.js 22
run:
  node demo.mjs

# run by Deno
deno-run:
  deno run -A demo.mjs

# run by Bun
bun-run:
  bun run demo.mjs

# run demo.mjs to call exported method from Kotlin Wasm
demo:
  node demo.mjs

# build for release
build:
  ./gradlew build
  ls -al build/js/packages/kotlin-wasm-node-example-wasm-js/kotlin/*.wasm

release:
  ./gradlew compileProductionExecutableKotlinWasmJsOptimize

# bundle with esbuild
bundle:
  esbuild demo.mjs --bundle --format=esm --outfile=dist/bundle.js
  cp build/js/packages/kotlin-wasm-node-example-wasm-js/kotlin/kotlin-wasm-node-example-wasm-js.wasm ./dist

# clean
clean:
  ./gradlew clean
  rm -rf kotlin-js-store