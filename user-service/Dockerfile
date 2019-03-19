FROM openjdk:11

WORKDIR /app

RUN pwd

COPY ./target/user-service-0.0.1-SNAPSHOT.jar ./user-service-0.0.1-SNAPSHOT.jar

RUN ls -la

CMD ["java", "-jar", "user-service-0.0.1-SNAPSHOT.jar"]