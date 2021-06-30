FROM openjdk:11

EXPOSE 8081

ADD target/spring-boot-k8s.jar spring-boot-k8s.jar

ENTRYPOINT ["java","-jar","/spring-boot-k8s.jar"]

