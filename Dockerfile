FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar  render-app-api-0.0.1-SNAPSHOT.jar render-app-api.jar
ENTRYPOINT ["java","-jar","/ascii-art-generator.jar"]