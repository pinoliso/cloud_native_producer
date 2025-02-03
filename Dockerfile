FROM openjdk:21-ea-24-oracle

WORKDIR /app
COPY target/qr4-1.0-SNAPSHOT.jar app.jar
EXPOSE 8080

CMD [ "java", "-jar", "app.jar" ]