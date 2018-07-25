FROM solsson/kafka:0.11.0.0

COPY config/connect-ethereum-source.properties config/
COPY config/connect-standalone.properties config/
COPY target/kafka-ethereum-connector-1.0.jar /opt/kafka/libs/

ENTRYPOINT ["./bin/connect-standalone.sh", "config/connect-standalone.properties", "config/connect-ethereum-source.properties"]