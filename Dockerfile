FROM openjdk:slim
WORKDIR /home
COPY ./target/prime-service-0.0.1-SNAPSHOT.jar prime-service.jar
ENTRYPOINT ["java", "-jar", "prime-service.jar"]
