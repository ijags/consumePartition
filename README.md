Spring Cloud Stream - RabbitMQ

This project works with publishPartition app.

To run three consumerPartitions, try to run these commands in three different consoles:

1. java -jar target/consumePartition-0.0.3-SNAPSHOT.jar --spring.config.import=file:./partition1.yml
   
2. java -jar target/consumePartition-0.0.3-SNAPSHOT.jar --spring.config.import=file:./partition2.yml
   
3. java -jar target/consumePartition-0.0.3-SNAPSHOT.jar --spring.config.import=file:./partition3.yml

