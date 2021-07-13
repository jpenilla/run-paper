import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  `kotlin-dsl`
  id("com.gradle.plugin-publish")
  id("net.kyori.indra")
  id("net.kyori.indra.license-header")
  id("net.kyori.indra.publishing.gradle-plugin")
}

group = "xyz.jpenilla"
version = "1.0.4-SNAPSHOT"
description = "Gradle plugin adding a task to run a Paper Minecraft server"

repositories {
  mavenCentral()
  gradlePluginPortal()
}

dependencies {
  implementation(libs.bundles.jackson)
}

kotlin {
  explicitApi()
}

tasks {
  withType<KotlinCompile> {
    kotlinOptions {
      apiVersion = "1.4"
      jvmTarget = "1.8"
      freeCompilerArgs = listOf("-Xopt-in=kotlin.io.path.ExperimentalPathApi")
    }
  }
}

indra {
  javaVersions {
    target(8)
  }
  apache2License()
  github("jpenilla", "run-paper")
  publishSnapshotsTo("jmp", "https://repo.jpenilla.xyz/snapshots")
  configurePublications {
    pom {
      developers {
        developer {
          id.set("jmp")
          timezone.set("America/Los Angeles")
        }
      }
    }
  }
}

license {
  header(file("LICENSE_HEADER"))
}

indraPluginPublishing {
  plugin(
    "run-paper",
    "xyz.jpenilla.runpaper.RunPaper",
    "Run Paper",
    project.description,
    listOf("minecraft", "paper", "run")
  )
  website("https://github.com/jpenilla/run-paper")
}
