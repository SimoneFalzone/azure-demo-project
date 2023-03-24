#FROM gradle:7.6-jdk17
#
#WORKDIR /app
#
#COPY build/libs/AzureDemoApp-0.0.1-SNAPSHOT.jar /app/application.jar
#ENTRYPOINT java -jar ./application.jar

FROM gradle:7.6-jdk17 as gradle-builder

COPY ./build.gradle.kts ./build.gradle.kts
COPY ./settings.gradle.kts ./settings.gradle.kts
COPY ./src ./src
RUN gradle build --no-daemon
EXPOSE 8761

FROM openjdk:17-jdk-slim-buster

WORKDIR app

COPY --from gradle-builder /home/gradle/build/libs/AzureDemoApp-0.0.1-SNAPSHOT.jar /app/
CMD ["java", "-jar", "/app/AzureDemoApp-0.0.1-SNAPSHOT.jar"]
