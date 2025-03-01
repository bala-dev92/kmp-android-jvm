

plugins {
    alias(libs.plugins.android.library)
    kotlin("multiplatform")
}

kotlin {
    androidTarget()
    jvm()

    sourceSets {
        val commonMain by getting {

        }
        val commonTest by getting {

        }
        val androidMain by getting {

            dependencies {

                implementation(libs.androidx.core.ktx)
                implementation(libs.androidx.appcompat)
                implementation(libs.material)
            }
        }
    }
}

android {
    namespace = "com.balag.kmplibrary"
    compileSdk = 35

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }
}
