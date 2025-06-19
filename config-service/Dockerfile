FROM openjdk:17-jdk

WORKDIR /app

COPY target/config-service-0.0.1-SNAPSHOT.jar /app/config-service-0.0.1-SNAPSHOT.jar

EXPOSE 8762

CMD ["java", "-jar", "/app/config-service-0.0.1-SNAPSHOT.jar"]