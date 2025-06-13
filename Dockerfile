FROM openjdk:21

ARG JAR_FILE=target/spring-boot-git-actions.jar

COPY ${JAR_FILE} spring-boot-git-actions.jar

EXPOSE 8080:8080

ENTRYPOINT ["java", "-jar", "/spring-boot-git-actions.jar"]