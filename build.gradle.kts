@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    `version-catalog`
    alias(libs.plugins.kotlin) apply false
}

tasks.wrapper {
    gradleVersion = libs.versions.gradleVersion.get()
}

catalog {
    versionCatalog {
        from(files("libs.versions.toml"))
    }
}
