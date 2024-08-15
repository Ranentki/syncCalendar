FROM amazoncorretto:21

WORKDIR /app

COPY target/demo-0.0.1-SNAPSHOT.jar server.jar

EXPOSE 8080

CMD ["java", "-jar", "server.jar"]