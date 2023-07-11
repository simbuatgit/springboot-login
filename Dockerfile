FROM adoptopenjdk:11-jre-hotspot
EXPOSE 8080
ADD target/your-spring-boot-app.jar your-spring-boot-app.jar
ENTRYPOINT ["java", "-jar", "your-spring-boot-app.jar"]