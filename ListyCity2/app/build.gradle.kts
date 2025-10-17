plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.listycity2"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.listycity2"
        minSdk = 24
        targetSdk = 36
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    tasks.withType<Test>{
        useJUnitPlatform()
    }
}

dependencies {
//    implementation(files("Users/yashi/AppData/Local/Android/Sdk/platforms/android-36/android.jar"))

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)


    testImplementation("org.junit.jupiter:junit-jupiter-api:5.1.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.1.0")

    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}