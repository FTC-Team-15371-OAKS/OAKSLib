# OAKSLib

A FTC Java Library based on the structure of WPILib.

## Install

Add JitPack to your root `build.gradle`:

```groovy
allprojects {
    repositories {
        google()
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}
```

If your project uses `dependencyResolutionManagement` in `settings.gradle`, add it there instead:

```groovy
dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}
```

Then add the dependency:

```groovy
dependencies {
    implementation 'com.github.FTC-Team-15371-OAKS:OAKSLib:0.1.0'
}
```

For local development, run `./gradlew publishToMavenLocal` and use `mavenLocal()` with the same coordinate.
