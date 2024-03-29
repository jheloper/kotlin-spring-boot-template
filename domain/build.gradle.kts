dependencies {
    implementation(Libraries.spring_boot_web)
    implementation(Libraries.spring_boot_data_jpa)
    implementation(Libraries.spring_boot_actuator)
    implementation(Libraries.spring_boot_log4j2)

    implementation(Libraries.jackson_module_kotlin)

    implementation(Libraries.javax_validation_api)
    implementation(Libraries.jaxb_api)

    runtimeOnly(Libraries.h2db)
    runtimeOnly(Libraries.spring_boot_devtools)
    testImplementation(Libraries.spring_boot_test)
}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.withType<Jar> {
    enabled = true
    archiveFileName.set("kotlin-spring-boot.jar")
}
