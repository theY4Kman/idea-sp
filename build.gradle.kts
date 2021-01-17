plugins {
    id("org.jetbrains.intellij") version "0.6.5"
    java
    idea
}

group = "org.idea_sp"
version = "0.1"

repositories {
    mavenCentral()
}

dependencies {
    testCompile("junit", "junit", "4.12")
}

// See https://github.com/JetBrains/gradle-intellij-plugin/
intellij {
    version = "2020.3.1"
}
tasks.getByName<org.jetbrains.intellij.tasks.PatchPluginXmlTask>("patchPluginXml") {
    changeNotes("""
      Add change notes here.<br>
      <em>most HTML tags may be used</em>""")
}

sourceSets.getByName("main") {
    java.srcDir("src/main/java")
    java.srcDir("src/main/kotlin")
    java.srcDir("gen")
}

idea {
    module {
        generatedSourceDirs.add(file("gen"))
    }
}