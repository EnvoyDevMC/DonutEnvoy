plugins {
    id 'java' // Standard Java plugin
    id 'maven-publish' // Allows publishing to Maven Central/GitHub
}

group 'com.donutenvoy'
version '1.2.0' // Matches your README version!

repositories {
    // IMPORTANT: These are the repositories where other mods/libraries are found
    mavenCentral()
    // Add this one if you use Fabric/Forge specific repositories
    maven { url 'https://maven.fabricmc.net/' }
}

dependencies {
    // Core Minecraft Library (If using standard Forge/Fabric setup)
    implementation 'net.minecraft:minecraft-library:1.20.1' // Change version as needed

    // A utility library you might use (e.g., Gson for JSON parsing)
    implementation 'com.google.code.gson:gson:2.10.1'

    // Testing Framework
    testImplementation 'org.junit.jupiter:junit-jupiter-api:5.10.0'
    testRuntimeOnly 'org.junit.jupiter:junit-jupiter-engine:5.10.0'
}

// Task to run tests automatically when pushing to GitHub
test {
    useJUnitPlatform()
}
