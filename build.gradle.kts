@file:Suppress("DEPRECATION")

buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        //noinspection UseTomlInstead
        classpath("com.android.tools.build:gradle:8.1.4")
        //noinspection UseTomlInstead
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.22")
        // Update to the new KSP version that supports Kotlin 1.9.22
        //noinspection UseTomlInstead
        classpath("com.google.devtools.ksp:symbol-processing-gradle-plugin:2.1.0-1.0.29")
    }
}

plugins {
    id("com.android.application") version "8.1.4" apply false
    id("org.jetbrains.kotlin.android") version "2.0.0" apply false
    id("com.google.devtools.ksp") version "2.1.0-1.0.29" apply false
}

tasks.register<Delete>("customClean") {
    delete(rootProject.buildDir)
}