FROM openjdk:11

WORKDIR /app

RUN pwd

COPY ./target/zuul-api-gateway-0.0.1-SNAPSHOT.jar ./zuul-api-gateway-0.0.1-SNAPSHOT.jar

RUN ls -la

CMD ["java", "-jar", "zuul-api-gateway-0.0.1-SNAPSHOT.jar"]