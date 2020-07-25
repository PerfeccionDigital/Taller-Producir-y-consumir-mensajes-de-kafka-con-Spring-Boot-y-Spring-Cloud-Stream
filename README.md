# Taller-Producir-y-consumir-mensajes-de-kafka-con-Spring-Boot-y-Spring-Cloud-Stream

### Testing Service

Test the consumer service by invoke the producer service  through  the REST service in the console.

```sh
curl --header "Content-Type: application/json" \
  --request POST \
  --data '{"author":"name","text":"message"}' \
  http://localhost:8080/message
  ```