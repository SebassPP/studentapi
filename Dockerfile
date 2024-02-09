FROM openjdk
COPY build/libs/studentapi-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]