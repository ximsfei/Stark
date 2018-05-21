#!/bin/bash
./gradlew :stark-gradle:uploadArchives
./gradlew :stark-sample:clean :stark-sample:assembleDebug -q --stacktrace
#./gradlew :app:starkBackupDebug
