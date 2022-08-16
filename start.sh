#!/bin/bash

java -jar \
  -Dcom.sun.management.jmxremote \
  -Dcom.sun.management.jmxremote.port=$JMX_PORT \
  -Dcom.sun.management.jmxremote.rmi.port=$JMX_PORT \
  -Dcom.sun.management.jmxremote.authenticate=false \
  -Dcom.sun.management.jmxremote.ssl=false \
  -Djava.rmi.server.hostname=0.0.0.0 \
  -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:8000 \
  /app/SimpleJMX.jar
