Kotlin WebAssembly Demo in Node.js 20
==============================================

Kotlin/Wasm(GC) demo in Node.js 22, Deno 1.46 and Bun 1.1.28.

# Requirements

* Kotlin 2.0.20
* Node.js 22.10.0
* Deno 2.0.0
* Bun 1.1.34

# Build and Run

```shell
$ ./gradlew wasmNodeRun
```

# Run with Node.js 22

```shell
$ node --experimental-wasm-exnref demo.mjs
```

# Run with Deno 2.0

```shell
$ deno run -A --v8-flags=--experimental-wasm-exnref demo.mjs
```

# Run with Bun 1.1.34

```shell
$ bun run demo.mjs
```

# References

* Kotlin Wasm: https://kotlinlang.org/docs/wasm-get-started.html
* Kotlin Wasm Interoperability with JavaScript: https://kotlinlang.org/docs/wasm-js-interop.html