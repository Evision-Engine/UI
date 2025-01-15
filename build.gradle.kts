plugins {
    kotlin("jvm") version "1.9.0"
    id("org.jetbrains.compose") version "1.6.10"
}

repositories {
    google()
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

dependencies {
    implementation(compose.desktop.currentOs)
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.9.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.0")
    implementation("org.jetbrains.compose.ui:ui-desktop:1.6.10")
    implementation("org.jetbrains.compose.foundation:foundation-desktop:1.6.10")
    implementation("org.jetbrains.compose.material:material-desktop:1.6.10")
}

compose.desktop {
    application {
        mainClass = "MainKt"
    }
}