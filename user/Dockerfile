FROM openjdk:17-alpine

WORKDIR /app
COPY ./target/user-service-0.0.1-SNAPSHOT.jar /app

RUN apk add --no-cache bash iputils

EXPOSE 8082

CMD ["java", "-jar", "user-service-0.0.1-SNAPSHOT.jar"]