package com.vitoksmile.plugins

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.Copy
import org.gradle.kotlin.dsl.register

class EditorPlugin : Plugin<Project> {

    override fun apply(project: Project): Unit = with(project) {
        val editorConfiguration = configurations.create("editor")

        tasks.register<Copy>("updateEditorConfig") {
            description = "Update .editorconfig file"
            group = "EditorConfig"

            from(file(editorConfiguration.asPath))
            rename { ".editorconfig" }
            into(rootDir)
        }
    }
}
