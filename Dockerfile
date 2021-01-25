# Build runtime image
FROM openjdk:8-jdk-alpine
EXPOSE 8181
WORKDIR /app
COPY ./target/docker-team-city-0.0.1-SNAPSHOT.jar /app/docker-team-city.jar
ENV SPRING_CONFIG_NAME=docker-team-city
# The environment variable used by spring to reference the external file
CMD ["/usr/bin/java", "-jar", "/app/docker-team-city.jar"]