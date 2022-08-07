FROM amazoncorretto:18
COPY target/SimpleJMX-1.0-SNAPSHOT-jar-with-dependencies.jar /app/SimpleJMX.jar

CMD ["java", "-jar", "/app/SimpleJMX.jar"]