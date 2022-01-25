# syntax=docker/dockerfile:1

FROM openjdk:11

WORKDIR /app

COPY project/.mvn/ .mvn
COPY project/mvnw project/pom.xml ./
RUN ./mvnw dependency:go-offline

COPY project ./

CMD ["./mvnw", "spring-boot:run"]