# HyperPay SDK Implemnation Library
# Installer File AAR "appwa.mobile.aar" by implementaion dependence

## Version sdk hyper pay number :
* edition of aar file is : 8991
* last udpate version 2025-04
* example ipworks3ds_sdk_8991.aar

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
 
----

----

## Step 2 : Download all files .aar
*  edition of aar file is : 8991
* example ipworks3ds_sdk_8991.aar
``` 
    // oppwa aar
    implementation 'com.github.AbdallahDafa:hyperpay_sdk_library:v1.0.32'
    implementation 'com.github.AbdallahDafa:hyperpay_sdk_library:1.0.32:oppwa@aar'

    // mas aar
    implementation 'com.github.AbdallahDafa:hyperpay_sdk_library_msa:v1.0.32'
    implementation 'com.github.AbdallahDafa:hyperpay_sdk_library_msa:1.0.32:msa@aar'

    //3ds aar
    implementation 'com.github.AbdallahDafa:hyperpay_sdk_library_3ds:v1.0.36'
    implementation 'com.github.AbdallahDafa:hyperpay_sdk_library_3ds:1.0.36:ipworks3ds_sdk@aar'
```

-----

-----

##  AAR FIle : Install sdk in your project (Optional )

### implementation to build.gradle depenences ( if you need implement to download single file oppwa)
``` 
    implementation 'com.github.AbdallahDafa:hyperpay_sdk_library:v1.0.36'
    implementation 'com.github.AbdallahDafa:hyperpay_sdk_library:1.0.36:oppwa@aar' 
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

