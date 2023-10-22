pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "OnmiAndroid"
include(":app")
include(":navigation")
include(":feature:enterinformation")
include(":feature:main")
include(":feature:notice")
include(":feature:setup")
include(":feature:allergies")
include(":feature:timetable")
include(":feature:tutorials")
include(":domain:school:domain")
include(":domain:school:data")
include(":domain:department:domain")
include(":domain:department:data")
include(":domain:meal:domain")
include(":domain:meal:data")
include(":domain:allergies:domain")
include(":domain:allergies:data")
