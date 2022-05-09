import org.jetbrains.grammarkit.tasks.GenerateLexerTask
import org.jetbrains.grammarkit.tasks.GenerateParserTask


plugins {
    kotlin("jvm") version "1.5.10"
    id("org.jetbrains.intellij") version "1.0"
    id("org.jetbrains.grammarkit") version "2021.2.2"
    java
    idea
}


group = "org.idea_sp"
version = "0.0.1"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

// See https://github.com/JetBrains/gradle-intellij-plugin/
intellij {
    version.set("2021.3.3")

    plugins.set(listOf("PsiViewer:213-SNAPSHOT", "com.jetbrains.hackathon.indices.viewer:1.20"))
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

tasks.register<GenerateLexerTask>("generateSourcePawnLexer") {
    source.set("src/main/grammar/SourcePawn.flex")
    targetDir.set("src/main/gen/org/idea_sp/")
    targetClass.set("_SourcePawnLexer")
    purgeOldFiles.set(true)
}

tasks.register<GenerateParserTask>("generateSourcePawnParser") {
    source.set("src/main/grammar/SourcePawn.bnf")
    pathToParser.set("/org/idea_sp/parser/SourcePawnParser.java")
    pathToPsiRoot.set("/org/idea_sp/parser/psi")
    targetRoot.set("src/main/gen")
    purgeOldFiles.set(true)
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
}
