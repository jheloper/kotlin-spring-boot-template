plugins {
    id(Plugins.spring_boot) version Plugins.Versions.spring_boot
    id(Plugins.dependency_management) version Plugins.Versions.dependency_management

    id(Plugins.kotlin_jvm) version Plugins.Versions.kotlin
    id(Plugins.kotlin_kapt) version Plugins.Versions.kotlin

    // https://kotlinlang.org/docs/reference/compiler-plugins.html
    id(Plugins.kotlin_allopen) version Plugins.Versions.kotlin
    id(Plugins.kotlin_noarg) version Plugins.Versions.kotlin
    id(Plugins.kotlin_spring) version Plugins.Versions.kotlin
    id(Plugins.kotlin_jpa) version Plugins.Versions.kotlin
}

java.sourceCompatibility = JavaVersion.VERSION_11

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

allprojects {
    group = "com.example"
    version = "0.0.1-SNAPSHOT"

    repositories {
        mavenCentral()
    }
}

subprojects {
    apply {
        plugin(Plugins.kotlin_jvm)
        plugin(Plugins.kotlin_kapt)
        plugin(Plugins.kotlin_allopen)
        plugin(Plugins.kotlin_noarg)
        plugin(Plugins.kotlin_spring)
        plugin(Plugins.kotlin_jpa)
    }

    dependencies {
        implementation(Libraries.kotlin_reflect)
        implementation(Libraries.kotlin_stdlib_jdk8)
    }

    tasks {
        compileKotlin {
            kotlinOptions {
                freeCompilerArgs = listOf("-Xjsr305=strict")
                jvmTarget = "11"
            }
        }

        compileTestKotlin {
            kotlinOptions {
                freeCompilerArgs = listOf("-Xjsr305=strict")
                jvmTarget = "11"
            }
        }
    }
}