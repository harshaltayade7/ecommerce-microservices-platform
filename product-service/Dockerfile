# Use lightweight Java image
FROM eclipse-temurin:17-jdk-alpine

# Set working directory
WORKDIR /app

# Copy jar file into container
COPY target/*.jar app.jar

# Expose service port
EXPOSE 8082

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]