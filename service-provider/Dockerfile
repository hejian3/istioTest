FROM openjdk:8-jdk-alpine

ENV SERVERDIRNAME java_hello

COPY ./target/service-provider-1.0-SNAPSHOT.jar /opt/service-provider-1.0-SNAPSHOT.jar

ARG service_version
ENV SERVICE_VERSION ${service_version:-v1}

ENTRYPOINT ["java","-jar","/opt/service-provider-1.0-SNAPSHOT.jar"]