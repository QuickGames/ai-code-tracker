plugins {
    `java-library`
    `maven-publish`
}

group = "com.quickgames.act"
version = "0.0.1"

base {
    archivesName = "annotation"
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
    withSourcesJar()
    withJavadocJar()
}

repositories {
    mavenCentral()
}

publishing {
    publications {
        register<MavenPublication>("library") {
            from(components["java"])
            artifactId = "annotation"
        }
    }

    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/QuickGames/ai-code-tracker")

            credentials {
                username = System.getenv("GITHUB_ACTOR")
                password = System.getenv("GITHUB_TOKEN")
            }
        }
    }
}
