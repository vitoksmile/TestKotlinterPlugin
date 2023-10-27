##### Sample project to use Kotlinter plugin v.4

------------



Running this command
```console
./gradlew :plugins:build
```
returns the error when using Kotlinter plugin v.4.0.0
> Execution failed for task 'plugins:compileKotlin'. org/jetbrains/kotlin/incremental/IncrementalJvmCompilerRunnerKt

If switch back to v.3.16.0 build command goes fine (see branch **3.16.0**).
