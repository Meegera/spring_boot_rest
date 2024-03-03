FROM openjdk:17

EXPOSE 8080

ADD target/hw_spring_boot_rest-0.0.1-SNAPSHOT.jar app.jar

CMD ["java","-jar","app.jar"]
