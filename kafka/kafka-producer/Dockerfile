FROM openjdk:8
COPY ./target/producer-0.0.1-SNAPSHOT.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java","-jar", "producer-0.0.1-SNAPSHOT.jar", "net.tine2k.kafka.producer.KafkaProducerApplication"]