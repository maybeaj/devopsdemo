FROM eclipse-temurin:17-jdk-alpine AS build

ARG JAR_FILE=build/libs/devopsdemo-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} app.jar

ENTRYPOINT [ "java", "-jar",  "/app.jar" ]