![logo](logo.png)

[![release](https://img.shields.io/badge/release-0.0.1-green.svg)](http://jcenter.bintray.com/com/ximsfei/stark)
![build](https://img.shields.io/badge/build-passing-green.svg)
![pr](https://img.shields.io/badge/PRs-welcome-blue.svg)
[![license](https://img.shields.io/badge/license-Apache--2.0-blue.svg)](#license)

Stark is a hot-fix framework for Android. It supports swapping new implementations of classes without restarting a running Android application, and updated Android resources (icons, layout, etc) while only restarting the Android Activity.

## Getting Started

The Gradle Dependency is available via [jCenter](https://bintray.com/pengfeng/ximsfei),

Firstly, add dependency directly in your root project's build.gradle:

```gradle
buildscript {
    repositories {
        jcenter()
    }
    dependencies {
        classpath 'com.ximsfei:stark-gradle:0.0.1'
    }
}
```

Secondly, apply `com.ximsfei.stark` plugin and add stark core dependencies in your Android application project's build.gradle:

```gradle
apply plugin: 'com.android.application'
apply plugin: 'com.ximsfei.stark'

dependencies {
    implementation 'com.ximsfei:stark-core:0.0.1'
}
```

Initialize stark framework in application's `attachBaseContext`:

```java
public class YourApp extends Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        Stark.get().load(base);
    }
}
```

After got the patch file, invoke the `applyPatchAsync` method to apply patch.

```java
public class AnyClass {
    public void applyPatch(Context context, String path) {
        Stark.get().applyPatchAsync(context, path);
    }
}
```

After adding the dependencies and apply plugin, refresh gradle project, stark plugin will add two more tasks for you:

You can find them in the gradle stark task group.

1. starkBackup + BuildType

After running the `assemble + BuildType`, run the backup task can backup the files needed to generate the patch for you.

Even you can enable an automatic backup configuration in the [stark.properties](#configuration-files) file. 

2. starkGeneratePatch + BuildType

When you find a bug in an online apk, you can fix the code and run the `starkGeneratePatch + BuildType` task to generate hot-fix patch.

The `starkGeneratePatch + BuildType` task relies on files backed up by the `starkBackup + BuildType` task.
 
## Configuration files

Also, the stark plugin will generate two configuration files in your Android application project dir:

> stark.properties

```properties
# If autoBackup configuration is true.
# Stark plugin will automatically backup the files needed to generate the patch.
# Otherwise, you need to run the stark backup task manually.
autoBackup=false

# If allStark configuration is true.
# Stark plugin will inject redirection code into all BuildType(debug/release).
# You'd better disable this configuration at the development stage.
allStark=false

# If releaseStark configuration is true.
# Stark plugin will inject redirection code into release stage.
releaseStark=true

# If your project needs to use multidex.
# You'd better get rid of the `multiDexEnabled = true` in build.gradle and enable it here.
multiDexEnabled=false
```

> stark-rules.txt

```text
# Add project specific stark rules here.
# include packages that need  to be fixed in the future.
# exclude packages that never to be fixed in the future.

-include: applicationId.

-exclude: android.support.
```

## More

* Read the [wiki](https://github.com/ximsfei/Stark/wiki)

## Thinks

Thanks to InstantRun, Tinker, Small, jbsdiff and Robust.

## About Author

Pengfeng Wang(王鹏锋)

email: ximsfei@gmail.com

## [License](LICENSE)
