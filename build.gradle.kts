import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
    application
}

group = "com.gmarket"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("junit:junit:4.13.1")
    // https://mvnrepository.com/artifact/org.jetbrains.kotlin/kotlin-reflect
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.7.10")
    // https://mvnrepository.com/artifact/org.jetbrains.kotlinx/kotlinx-html-jvm
    implementation("org.jetbrains.kotlinx:kotlinx-html-jvm:0.7.5")
    // https://mvnrepository.com/artifact/org.jetbrains.exposed/exposed
    implementation("org.jetbrains.exposed:exposed:0.17.14")
// https://mvnrepository.com/artifact/org.jetbrains.anko/anko
    implementation("org.jetbrains.anko:anko:0.10.4")

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}

application {
    mainClass.set("MainKt")
}