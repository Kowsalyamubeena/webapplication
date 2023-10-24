FROM eclipse-temurin:17
COPY target/webapplication.jar webapplication.jar
CMD [ "java", "-jar","devops.jar" ]