FROM openjdk:11

WORKDIR /app

RUN pwd

COPY ./target/config-service-0.0.1-SNAPSHOT.jar ./config-service-0.0.1-SNAPSHOT.jar

RUN ls -la

CMD ["java", "-jar", "config-service-0.0.1-SNAPSHOT.jar"]