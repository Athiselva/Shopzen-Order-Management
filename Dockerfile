FROM java:8

EXPOSE 8080

ADD target/Shopzen-Order-Management.jar Shopzen-Order-Management.jar

ENTRYPOINT ["java", "-jar", "Shopzen-Order-Management.jar"]