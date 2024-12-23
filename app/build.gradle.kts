plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.devtools.ksp")
}

android {
    namespace = "com.alterpat.budgettracker"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.alterpat.budgettracker"
        minSdk = 24
        //noinspection OldTargetApi
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    //noinspection UseTomlInstead
    implementation("org.jetbrains.kotlin:kotlin-stdlib:2.1.0")
    //noinspection UseTomlInstead
    implementation("androidx.core:core-ktx:1.15.0")
    //noinspection UseTomlInstead
    implementation("androidx.appcompat:appcompat:1.7.0")
    //noinspection UseTomlInstead
    implementation("androidx.constraintlayout:constraintlayout:2.2.0")
    //noinspection UseTomlInstead
    implementation("com.google.android.material:material:1.12.0")

    //noinspection UseTomlInstead
    implementation("androidx.room:room-runtime:2.6.1")
    //noinspection UseTomlInstead
    ksp("androidx.room:room-compiler:2.6.1")

    //noinspection UseTomlInstead
    testImplementation("junit:junit:4.13.2")
    //noinspection UseTomlInstead
    androidTestImplementation("androidx.test.ext:junit:1.2.1")
    //noinspection UseTomlInstead
    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")
}