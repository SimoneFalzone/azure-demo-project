FROM gradle:7.6-jdk17

WORKDIR /app

COPY build/libs/AzureDemoApp-0.0.1-SNAPSHOT.jar /app/application.jar
ENTRYPOINT java -jar ./application.jar