FROM eclipse-temurin:17

EXPOSE 8080

WORKDIR /app

COPY build/libs/djk-0.0.1-SNAPSHOT.jar /app/djk.jar

ENTRYPOINT ["java", "-jar", "djk.jar"]