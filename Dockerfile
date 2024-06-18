FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} psh-scheduler-service.jar
ENTRYPOINT ["java","-jar","/psh-scheduler-service.jar"]