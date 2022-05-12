plugins {
    id(Plugins.spring_boot)
    id(Plugins.dependency_management)
    id(Plugins.kotlin_jvm)
    id(Plugins.kotlin_spring)
    id(Plugins.kotlin_noarg)
}

dependencies {
    api(project(":domain"))

    implementation(Libraries.kotlin_reflect)
    implementation(Libraries.kotlin_stdlib_jdk8)

    implementation(Libraries.spring_boot_web)
    implementation(Libraries.spring_boot_actuator)
    implementation(Libraries.spring_boot_devtools)
    implementation(Libraries.spring_boot_log4j2)
    implementation(Libraries.spring_boot_security)

    implementation(Libraries.jackson_module_kotlin)

    testImplementation(Libraries.spring_boot_test)

    // Testcontainers
    testImplementation(Libraries.testcontainers)
    testImplementation(Libraries.testcontainers_junit_jupiter)
    testImplementation(Libraries.testcontainers_postgresql)
}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.withType<Jar> {
    archiveFileName.set("kotlin-spring-boot-web.jar")
}
