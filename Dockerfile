FROM openjdk
COPY build/libs/studentapi-0.0.1-SNAPSHOT.jar app.jar
ENV PORT 8080
WORKDIR /app
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar", "--server.port=8080"]