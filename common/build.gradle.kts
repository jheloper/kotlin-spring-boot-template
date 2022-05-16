plugins {
    id(Plugins.kotlin_jvm)
    id(Plugins.kotlin_noarg)
}

dependencies {
    implementation(Libraries.jackson_module_kotlin)

    testImplementation(Libraries.junit_jupiter)
}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.withType<Jar> {
    enabled = false
}
