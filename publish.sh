#!/bin/bash
./gradlew :stark-gradle:uploadArchives
./gradlew :app:clean :app:assembleDebug -q --stacktrace
./gradlew :app:starkBackupDebug
