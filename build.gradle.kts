// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.3" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
//    id("com.google.dagger.hilt.android") version "2.44" apply false
    id("org.jetbrains.kotlin.jvm") version "1.8.10" apply false
    id("com.android.library") version "8.1.3" apply false
    id("com.google.devtools.ksp") version "1.9.20-1.0.14" apply false


}

buildscript {
    dependencies {
        classpath(libs.hilt.gradle.plugin)
//        classpath(libs.kotlinx.serialization.plugin)
        classpath(libs.ksp.plugin)

    }
}