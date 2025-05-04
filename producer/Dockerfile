FROM openjdk:17
LABEL maintaner="producer"
COPY target/producer-0.0.1-SNAPSHOT.jar producer.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","producer.jar"]
