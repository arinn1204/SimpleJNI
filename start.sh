#!/bin/bash

java -jar \
  -Dcom.sun.management.jmxremote.port=9001 \
  -Dcom.sun.management.jmxremote.authenticate=false \
  -Dcom.sun.management.jmxremote.ssl=false \
  /app/SimpleJMX.jar