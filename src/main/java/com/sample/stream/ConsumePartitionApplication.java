package com.sample.stream;

import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;

import com.sample.stream.model.Order;

@SpringBootApplication
public class ConsumePartitionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumePartitionApplication.class, args);
	}

	
	@Bean
    Consumer<Message<Order>> partitionOrders() {
        return message -> {
            System.out.println("Order received: " + message.getPayload());
            System.out.println("Message header: " + message.getHeaders());
        };
    }

	
	
}
