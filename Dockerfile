FROM openjdk:8-jdk-alpine
WORKDIR /home/docker-team-city/
COPY ./target/docker-team-city-0.0.1-SNAPSHOT.jar /home/docker-team-city/docker-team-city-0.0.1-SNAPSHOT.jar
ENV PORT 8181
EXPOSE $PORT
ENV TZ=Asia/Jakarta
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
RUN apk add --no-cache bash
CMD ["java","-jar","/home/docker-team-city/docker-team-city-0.0.1-SNAPSHOT.jar"]