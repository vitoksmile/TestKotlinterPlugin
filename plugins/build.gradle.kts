@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    `kotlin-dsl`
    alias(libs.plugins.kotlinter)
}

dependencies {
    implementation(libs.kotlinter.plugin)
}

gradlePlugin {
    plugins {
        register("editorPlugin") {
            id = "com.vitoksmile.plugins"
            implementationClass = "com.vitoksmile.plugins.EditorPlugin"
        }
    }
}
