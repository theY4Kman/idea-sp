import org.jetbrains.grammarkit.tasks.GenerateLexer
import org.jetbrains.grammarkit.tasks.GenerateParser


plugins {
    kotlin("jvm") version "1.4.10"
    id("org.jetbrains.intellij") version "0.6.5"
    id("org.jetbrains.grammarkit") version "2020.3.2"
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
}

idea {
    module {
        generatedSourceDirs.add(file("src/main/gen"))
    }
}


tasks.register<GenerateLexer>("generateSourcePawnLexer") {
    source = "src/main/grammar/SourcePawn.flex"
    targetDir = "src/main/gen/org/idea_sp/"
    targetClass = "_SourcePawnLexer"
}

tasks.register<GenerateParser>("generateSourcePawnParser") {
    source = "src/main/grammar/SourcePawn.bnf"
    pathToParser = "/org/idea_sp/parser/SourcePawnParser.java"
    pathToPsiRoot = "/org/idea_sp/parser/psi"
    targetRoot = "src/main/gen"
}