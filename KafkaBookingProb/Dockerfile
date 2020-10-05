FROM openjdk:11

WORKDIR /usr/app

EXPOSE 8080
ADD ./target/Kafka-Booking-1.0-SNAPSHOT-jar-with-dependencies.jar /usr/app/
RUN ls -ltr
RUN chmod 777 Kafka-Booking-1.0-SNAPSHOT-jar-with-dependencies.jar
RUN ls -ltr

ENTRYPOINT ["java", "-jar","/usr/app/Kafka-Booking-1.0-SNAPSHOT-jar-with-dependencies.jar","org.example.RunMain","producer"]
#CMD ["scala", "/usr/app/Kafka-Booking-1.0-SNAPSHOT.jar","org.example.RunMain","consumer"]