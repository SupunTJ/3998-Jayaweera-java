FROM openjdk:11
EXPOSE 8080
ADD target/3998-Jayaweera.jar 3998-Jayaweera.jar
ENTRYPOINT ["java", "-jar", "/3998-Jayaweera.jar"]