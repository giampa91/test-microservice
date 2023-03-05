FROM openjdk:17-alpine

WORKDIR /app
COPY ./target/gateway-0.0.1-SNAPSHOT.jar /app

RUN apk add --no-cache bash iputils

EXPOSE 8080

CMD ["java", "-jar", "gateway-0.0.1-SNAPSHOT.jar"]