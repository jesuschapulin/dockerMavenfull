FROM openjdk:8-jdk
RUN apt-get install -y tzdata
ENV TZ America/Mexico_City
MAINTAINER jesus (chaps.jesus.gz@gmail.com)
RUN apt-get update
RUN apt-get install -y maven
COPY pom.xml /usr/local/service/pom.xml
COPY src /usr/local/service/src
WORKDIR /usr/local/service
RUN mvn package
ENTRYPOINT [ "java","-jar","-Dspring-profiles.active=develop","target/dockerMavenfull-0.0.1-SNAPSHOT.jar"]
