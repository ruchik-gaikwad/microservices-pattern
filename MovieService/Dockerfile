FROM openjdk:11

WORKDIR /app

RUN pwd

COPY ./target/MovieService-0.0.1-SNAPSHOT.jar ./MovieService-0.0.1-SNAPSHOT.jar

RUN ls -la

CMD ["java", "-jar", "MovieService-0.0.1-SNAPSHOT.jar"]