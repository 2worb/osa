plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-kapt")
    id("kotlin-android-extensions")
}




android {
    compileSdkVersion(ProjectSettings.targetSdk)
    defaultConfig {
        applicationId = ProjectSettings.applicationId
        minSdkVersion(ProjectSettings.minSdk)
        targetSdkVersion(ProjectSettings.targetSdk)
        versionCode = ProjectSettings.versionCode
        versionName = ProjectSettings.versionName
        testInstrumentationRunner = ProjectSettings.testRunner
        multiDexEnabled = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    dataBinding {
        isEnabled = true
    }

    sourceSets {
        getByName("main").java.setSrcDirs(hashSetOf("src/main/kotlin"))
    }

    kapt {
        useBuildCache = true
    }

    buildTypes {
        getByName("debug") {
            isMinifyEnabled = false
            isShrinkResources = false
        }
    }

    flavorDimensions("api")
    productFlavors {
        create("funtaster") {
            setDimension("api")
        }
        create("skodaAutoDev") {
            setDimension("api")
        }
        create("skodaAutoProd") {
            setDimension("api")
        }
    }
	
}

dependencies {
    implementation(project(":plugin"))
    implementation(kotlin(Dependencies.Kotlin.stdlib, Versions.kotlin_version))
    implementation(kotlin(Dependencies.Kotlin.reflect, Versions.kotlin_version))

    implementation(Dependencies.Support.material)
    testImplementation(Dependencies.Tests.jUnit)
    androidTestImplementation(Dependencies.AndroidTests.runner)
    androidTestImplementation(Dependencies.AndroidTests.espresso)
}
