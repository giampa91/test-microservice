FROM openjdk:17

WORKDIR /app
COPY ./target/eureka-server-0.0.1-SNAPSHOT.jar /app

EXPOSE 8080

CMD ["java", "-jar", "eureka-server-0.0.1-SNAPSHOT.jar"]