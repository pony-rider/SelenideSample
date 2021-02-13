plugins {
    java
    id("io.qameta.allure") version "2.8.1"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("junit", "junit", "4.13.1")
    testImplementation("com.codeborne", "selenide", "5.15.1")
    implementation("io.qameta.allure:allure-junit4:2.13.6")
    implementation("io.qameta.allure:allure-selenide:2.13.6")

    runtimeOnly("org.slf4j:slf4j-simple:1.7.30")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}

test {
    useJUnit()
}

apply(java);
