FROM openjdk:8-jdk-alpine
ADD target/docker-team-city-0.0.1-SNAPSHOT.jar docker-team-city-0.0.1-SNAPSHOT.jar
EXPOSE 8181
ENTRYPOINT ["java",  "-jar", "docker-team-city-0.0.1-SNAPSHOT.jar"]