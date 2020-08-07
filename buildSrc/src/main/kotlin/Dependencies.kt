object Versions {
    const val kotlin = "1.3.72"
    const val spring_boot = "2.3.2.RELEASE"
    const val aws_sdk = "2.13.23"
    const val testcontainers = "1.14.3"
}

object Libraries {
    // kotlin
    const val kotlin_reflect = "org.jetbrains.kotlin:kotlin-reflect:${Versions.kotlin}"
    const val kotlin_stdlib_jdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"

    // spring boot
    const val spring_boot_web = "org.springframework.boot:spring-boot-starter-web:${Versions.spring_boot}"
    const val spring_boot_data_jpa = "org.springframework.boot:spring-boot-starter-data-jpa:${Versions.spring_boot}"
    const val spring_boot_test = "org.springframework.boot:spring-boot-starter-test:${Versions.spring_boot}"
    const val spring_boot_devtools = "org.springframework.boot:spring-boot-devtools:${Versions.spring_boot}"
    const val spring_boot_actuator = "org.springframework.boot:spring-boot-starter-actuator:${Versions.spring_boot}"

    // aws sdk v1 (for testcontainers localstack)
    const val aws_sdk_v1_core = "com.amazonaws:aws-java-sdk-core:1.11.820"

    // aws sdk v2
    const val aws_sdk_core = "software.amazon.awssdk:core:${Versions.aws_sdk}"
    const val aws_sdk_auth = "software.amazon.awssdk:auth:${Versions.aws_sdk}"
    const val aws_sdk_s3 = "software.amazon.awssdk:s3:${Versions.aws_sdk}"

    // jackson
    const val jackson_module_kotlin = "com.fasterxml.jackson.module:jackson-module-kotlin:2.11.1"

    // javax
    const val javax_validation_api = "javax.validation:validation-api:2.0.1.Final"

    // apache commons
    const val apache_commons_lang3 = "org.apache.commons:commons-lang3:3.10"

    // h2 database
    const val h2db = "com.h2database:h2:1.4.200"

    // postgresql
    const val postgresql = "org.postgresql:postgresql:42.2.12.jre7"

    // junit5
    const val junit_jupiter = "org.junit.jupiter:junit-jupiter:5.6.2"

    // jaxb
    const val jaxb_api = "javax.xml.bind:jaxb-api:2.3.1"

    // Testcontainers
    const val testcontainers = "org.testcontainers:testcontainers:${Versions.testcontainers}"
    const val testcontainers_junit_jupiter = "org.testcontainers:junit-jupiter:${Versions.testcontainers}"
    const val testcontainers_postgresql = "org.testcontainers:postgresql:${Versions.testcontainers}"
    const val testcontainers_localstack = "org.testcontainers:localstack:${Versions.testcontainers}"
}

object Plugins {
    const val kotlin_jvm = "org.jetbrains.kotlin.jvm"
    const val kotlin_allopen = "org.jetbrains.kotlin.plugin.allopen"
    const val kotlin_spring = "org.jetbrains.kotlin.plugin.spring"
    const val kotlin_noarg = "org.jetbrains.kotlin.plugin.noarg"
    const val kotlin_jpa = "org.jetbrains.kotlin.plugin.jpa"
    const val kotlin_kapt = "org.jetbrains.kotlin.kapt"

    const val dependency_management = "io.spring.dependency-management"
    const val spring_boot = "org.springframework.boot"

    object Versions {
        const val kotlin = "1.3.72"
        const val dependency_management = "1.0.9.RELEASE"
        const val spring_boot = "2.3.2.RELEASE"
    }
}