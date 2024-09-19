Kotlin WebAssembly Demo in Node.js 20
==============================================

Kotlin/Wasm(GC) demo in Node.js 22, Deno 1.46 and Bun 1.1.28.

# Requirements

* Kotlin 2.0.20
* Node.js 22.9.0
* Deno 1.46
* Bun 1.1.28

# Build and Run

```shell
$ ./gradlew wasmNodeRun
```

# Run with Node.js 22

```shell
$ node demo.mjs
```

# Run with Deno 1.46

```shell
$ deno run -A demo.mjs
```

# Run with Bun 1.1.28

```shell
$ bun run demo.mjs
```

# References

* Kotlin Wasm: https://kotlinlang.org/docs/wasm-get-started.html
* Kotlin Wasm Interoperability with JavaScript: https://kotlinlang.org/docs/wasm-js-interop.html