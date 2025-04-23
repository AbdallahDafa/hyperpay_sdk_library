# HyperPay SDK Implemnation Library

## Step 1 : allow download library 

* Add JitPack to your build.gradle (Project-level)
gradle
 
```groovy

allprojects {
    repositories {
        google()
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}
```
in newer Gradle versions (settings.gradle or settings.gradle.kts), make sure JitPack is added like this:
gradle

```groovy
dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
} 

```
## Step 2 : implementation library 

* in android/app/build.gradle file add in dependency : 
```
implementation 'com.github.AbdallahDafa:hyperpay_sdk_library:v1.0.8'

```
or using latest version number 