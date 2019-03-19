FROM openjdk:11

WORKDIR /app

RUN pwd

COPY ./target/eureka-service-0.0.1-SNAPSHOT.jar ./eureka-service-0.0.1-SNAPSHOT.jar

RUN ls -la

CMD ["java", "-jar", "eureka-service-0.0.1-SNAPSHOT.jar"]