FROM openjdk:8-jdk-alpine
ENV APP_FILE docker-team-city-0.0.1-SNAPSHOT.jar
ENV APP_HOME /usr/apps
EXPOSE 8181
COPY target/$APP_FILE $APP_HOME/
WORKDIR $APP_HOME
ENTRYPOINT ["sh", "-c"]
CMD ["exec java -jar $APP_FILE"]