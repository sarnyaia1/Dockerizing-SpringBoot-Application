FROM openjdk:17
ADD target/springboot-postgres-docker.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]