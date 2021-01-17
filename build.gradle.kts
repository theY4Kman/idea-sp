plugins {
    kotlin("jvm") version "1.4.10"
    id("org.jetbrains.intellij") version "0.6.5"
    java
    idea
}

group = "org.idea_sp"
version = "0.1"

repositories {
    mavenCentral()
}

// See https://github.com/JetBrains/gradle-intellij-plugin/
intellij {
    version = "2020.3.1"
}

sourceSets.getByName("main") {
    java.srcDir("src/main/java")
    java.srcDir("src/main/kotlin")
    java.srcDir("src/main/gen")
    java.srcDir("gen")
}

idea {
    module {
        // TODO: Use the same output directory for Parser and lexer
        generatedSourceDirs.add(file("gen"))
        generatedSourceDirs.add(file("src/main/gen"))
    }
}