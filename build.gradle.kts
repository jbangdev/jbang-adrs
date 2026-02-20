plugins {
    // Apply the JBang Gradle plugin using the Kotlin DSL syntax
    id("dev.jbang.gradle") version "0.1.1"
}

repositories {
    mavenCentral()
}

/**
 * Task to generate a Table of Contents for ADRs
 * This executes: jbang run adr@adoble generate toc
 */
tasks.register<dev.jbang.gradle.JBangTask>("generateADRToc") {
    script = "adr@adoble"
    arguments = listOf("generate", "toc")
}