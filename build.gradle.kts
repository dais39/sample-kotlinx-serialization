import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    repositories {
        jcenter()
    }

    val kotlinVersion = "1.3.30"

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
        classpath("org.jetbrains.kotlin:kotlin-serialization:$kotlinVersion")
    }
}

plugins{
    kotlin("jvm") version "1.3.30"
    id("kotlinx-serialization") version "1.3.30"
}

group = "com.dais39"
version = "1.0-SNAPSHOT"

repositories {
    jcenter()
    maven{setUrl("https://kotlin.bintray.com/kotlinx")}
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.3.30")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime:0.11.0")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}
