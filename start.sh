#!/bin/bash

java -jar \
  -Dcom.sun.management.jmxremote \
  -Dcom.sun.management.jmxremote.port=9001 \
  -Dcom.sun.management.jmxremote.rmi.port=9001 \
  -Dcom.sun.management.jmxremote.authenticate=false \
  -Dcom.sun.management.jmxremote.ssl=false \
  -Djava.rmi.server.hostname=0.0.0.0 \
  /app/SimpleJMX.jar
