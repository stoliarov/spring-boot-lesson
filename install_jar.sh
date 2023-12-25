#!/bin/sh

mvn clean install -Dmaven.test.skip=true
mvn install:install-file -Dfile=./target/spring-boot-lesson-0.0.1-SNAPSHOT.jar -DgroupId=ru.hh.spring_boot_lesson -DartifactId=spring-boot-lesson -Dversion=0.0.3 -Dpackaging=jar

