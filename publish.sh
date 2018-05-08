#!/bin/bash
./gradlew :stark-gradle:uploadArchives
./gradlew :app:clean :app:assembleDebug -q
./gradlew :app:starkBackupDebug
