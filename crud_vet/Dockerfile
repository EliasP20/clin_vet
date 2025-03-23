FROM openjdk:17-slim
ARG JAR_FILE=target/crud_vet-0.0.1.jar
COPY ${JAR_FILE} app_veterinary.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app_veterinary.jar"]
