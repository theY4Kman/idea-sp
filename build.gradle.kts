import org.jetbrains.grammarkit.tasks.GenerateLexer
import org.jetbrains.grammarkit.tasks.GenerateParser
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmOptions


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

    setPlugins("PsiViewer:203-SNAPSHOT", "com.jetbrains.hackathon.indices.viewer:1.12")
}

sourceSets.getByName("main") {
    java.srcDir("src/main/java")
    java.srcDir("src/main/kotlin")
    java.srcDir("src/main/gen")
    java.srcDir("src/main/grammar")
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
    purgeOldFiles = true
}

tasks.register<GenerateParser>("generateSourcePawnParser") {
    source = "src/main/grammar/SourcePawn.bnf"
    pathToParser = "/org/idea_sp/parser/SourcePawnParser.java"
    pathToPsiRoot = "/org/idea_sp/parser/psi"
    targetRoot = "src/main/gen"
    purgeOldFiles = true
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
}
