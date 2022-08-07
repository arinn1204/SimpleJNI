FROM amazoncorretto:18
COPY target/SimpleJMX-1.0-SNAPSHOT-jar-with-dependencies.jar /app/SimpleJMX.jar
COPY start.sh /app/start.sh

CMD ["bash", "/app/start.sh"]