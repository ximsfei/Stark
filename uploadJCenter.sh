#!/bin/bash

./gradlew clean stark-core:assembleRelease stark-core:bintrayUpload stark-gradle:bintrayUpload
