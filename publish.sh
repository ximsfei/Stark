#!/bin/bash
./gradlew clean :stark-core:assembleRelease :stark-core:uploadArchives :stark-gradle:uploadArchives
./gradlew :stark-sample:assembleDebug -q --stacktrace
#./gradlew :app:starkBackupDebug
