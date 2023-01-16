**topic logs:<br/>**
`kafka-console-consumer --topic <topic-name> --bootstrap-server 172.17.0.1:9092`

**send config into kafka-connect<br/>**
`curl -i -X PUT -H "Content-Type:application/json" http://localhost:8083/connectors/<connector-name>/config -d @src-config-name.json`<br/>

**delete all schemes in kafka-registry<br/>**
`curl -X DELETE http://localhost:8081/subjects/Kafka-value`

**delete version of schema in schema-registry<br/>**
`curl -X DELETE http://localhost:8081/subjects/Kafka-value/versions/<version>`

**delete the latest version of schema-registry<br/>**
`curl -X DELETE http://localhost:8081/subjects/Kafka-value/versions/latest`

**