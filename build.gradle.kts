import org.jetbrains.kotlin.gradle.plugin.KotlinPlatformType
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "2.1.0" // Use JVM plugin since it's not a multiplatform project
    id("org.jetbrains.compose") version "1.5.1"
}

repositories {
    google()
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

kotlin {
    jvmToolchain(23)
    sourceSets {
        val main by getting {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
                implementation("org.jetbrains.compose.ui:ui-desktop:1.5.1")
                implementation("org.jetbrains.compose.material:material-desktop:1.5.1")
                implementation("org.openjfx:javafx-controls:19.0.2.1:mac") // Ensure platform compatibility
                implementation("org.openjfx:javafx-graphics:19.0.2.1:mac")
                implementation("org.jetbrains.compose:compose-runtime:1.5.1")
            }
        }

        tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
            kotlinOptions {
                jvmTarget = "23"
            }
        }
        val test by getting {
            dependencies {
                implementation(kotlin("test"))
                implementation("org.junit.jupiter:junit-jupiter:5.10.0")
            }
        }
    }
}

compose.desktop {
    application {
        mainClass = "MainKt"
    }
}