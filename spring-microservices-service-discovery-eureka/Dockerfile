FROM openjdk:8-jdk-alpine

LABEL maintainer="avinash@outlook.com"

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8080 available to the world outside this container
EXPOSE 8761

COPY ./target/spring-microservices-service-discovery-0.0.1-SNAPSHOT.jar /usr/service-discovery-0.0.1-SNAPSHOT.jar
WORKDIR /usr/service-discovery-0.0.1-SNAPSHOT.jar


# Run the jar file 
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app-service-discovery.jar"]