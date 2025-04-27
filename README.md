# HyperPay SDK Implemnation Library
# Installer File AAR "appwa.mobile.aar" by implementaion dependence

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
 

-----

-----

## Step 2 : Install sdk in your project

### implementation to build.gradle depenences 
``` 
    implementation 'com.github.AbdallahDafa:hyperpay_sdk_library:v1.0.30'
    implementation 'com.github.AbdallahDafa:hyperpay_sdk_library:1.0.30:oppwa@aar' 
```


### Testing Installing without SDK
* in android/app/build.gradle file add in dependency :

* this version have no .aar files, means just for testing , try in code use class "TestHyperPay.getName();"
```

```
or using latest version number

* after install trying to get name of testin
```
        TestHyperPay.getName();
```

