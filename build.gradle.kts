@file:Suppress("DEPRECATION")

plugins {
    kotlin("multiplatform").apply(false)
    id("com.android.application").apply(false)
    id("com.android.library").apply(false)
    id("org.jetbrains.compose").apply(false)
}
tasks.register("clean",Delete::class){
    delete(rootProject.buildDir)
}
