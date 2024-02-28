FROM openjdk:11

## Set the working directory in the container
#WORKDIR /app
#
##add the location of JAR file
#COPY target/springbo-mysql-docker.jar /app/springbo-mysql-docker.jar
#
#
## Expose the port that your Spring Boot application is listening on (change '8080' to the appropriate port)
#EXPOSE 8080
#
#CMD ["java", "-jar", "/app/springbo-mysql-docker.jar"]
#
#
EXPOSE 8080

ADD target/springbo-mysql-docker.jar /app/springbo-mysql-docker.jar
ENTRYPOINT ["java", "-jar", "/app/springbo-mysql-docker.jar"]

#ADD target/*.jar app.jar
#ENTRYPOINT ["java","-jar","app.jar"]