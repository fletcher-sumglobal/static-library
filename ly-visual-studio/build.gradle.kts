plugins {
    `java-gradle-plugin`
}

group = "org.gradle.samples"
version = "1.0"

gradlePlugin {
    (plugins) {
        register("lyVisualStudioPlugin") {
            id = "org.gradle.samples.ly-visual-studio"
            implementationClass = "org.gradle.samples.plugins.LyVisualStudioPlugin"
        }
    }
}