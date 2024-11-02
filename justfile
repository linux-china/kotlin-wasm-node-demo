# run Wasm with node
start:
  ./gradlew wasmJsNodeRun

# start with production
start-prod:
  ./gradlew wasmJsNodeProductionRun

# run by node.js 22
run:
  node --experimental-wasm-exnref demo.mjs

# run by Deno
deno-run:
  deno run --v8-flags=--experimental-wasm-exnref -A demo.mjs

# run by Bun
bun-run:
  bun run demo.mjs

# run demo.mjs to call exported method from Kotlin Wasm
demo:
  node demo.mjs

# run demo.mjs to call exported method from Kotlin Wasm
wasmtime-run:
  wasmtime run -W function-references,gc --invoke welcome build/js/packages/kotlin-wasm-node-example-wasm-js/kotlin/kotlin-wasm-node-example-wasm-js.wasm "Jackie"

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
