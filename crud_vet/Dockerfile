# Compilation
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app

# Copy File Projects
COPY pom.xml .
COPY src ./src

# Compile the Project
RUN mvn clean package -DskipTests

# Execution
FROM openjdk:17-jdk-slim
WORKDIR /app

# Copy .jar file
COPY --from=build /app/target/crud_vet-0.0.1.jar app_veterinary.jar

# Expose the port
EXPOSE 8080

# Execute the app
ENTRYPOINT ["java", "-jar", "app_veterinary.jar"]
