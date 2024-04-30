plugins {
    alias(libs.plugins.androidApplication)
}

android {
    namespace = "com.wmods.wppenhacer"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.wmods.wppenhacer"
        minSdk = 28
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    packaging {
        resources {
            excludes += "META-INF/**"
            excludes += "okhttp3/**"
            excludes += "kotlin/**"
            excludes += "org/**"
            excludes += "**.properties"
            excludes += "**.bin"
        }
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
    buildFeatures {
        viewBinding = true
        buildConfig = true
    }
}

dependencies {
    implementation(libs.colorpicker)
    implementation(libs.dexkit)
    compileOnly(libs.libxposed.legacy)

    implementation(libs.androidx.activity)
    implementation(libs.androidx.browser)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.core)
    implementation(libs.androidx.fragment)
    implementation(libs.androidx.navigation.fragment)
    implementation(libs.androidx.navigation.ui)
    implementation(libs.androidx.preference)
    implementation(libs.androidx.recyclerview)
    implementation(libs.androidx.swiperefreshlayout)
    implementation(libs.rikkax.appcompat)
    implementation(libs.rikkax.core)
    implementation(libs.rikkax.insets)
    implementation(libs.rikkax.material)
    implementation(libs.rikkax.material.preference)
    implementation(libs.rikkax.preference)
    implementation(libs.rikkax.recyclerview)
    implementation(libs.rikkax.widget.borderview)
    implementation(libs.rikkax.widget.mainswitchbar)
    implementation(libs.rikkax.layoutinflater)


    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

}

configurations.all {
    exclude("org.jetbrains", "annotations")
    exclude("androidx.appcompat", "appcompat")
    exclude("org.jetbrains.kotlin", "kotlin-stdlib-jdk7")
    exclude("org.jetbrains.kotlin", "kotlin-stdlib-jdk8")
}