Kotlin WebAssembly hello world in V8
====================================

**Warning : highly experimental status**

This sample leverages Kotlin/Wasm and V8 and GC, typed function references and exception handling proposals.

# Setup

```bash
npm install jsvu -g
jsvu v8@9.2.212
```

# Run test

```bash
./gradlew build
cd build/js/packages/nodejs-hello-world-wasm/kotlin; ~/.jsvu/v8-9.2.212 --experimental-wasm-typed-funcref --experimental-wasm-gc --experimental-wasm-eh --module ./nodejs-hello-world-wasm.js
```

# References

* jsvu: JavaScript (engine) Version Updater https://github.com/GoogleChromeLabs/jsvu
