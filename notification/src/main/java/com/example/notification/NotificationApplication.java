package com.example.notification;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class NotificationApplication {
	
	Logger LOG = LoggerFactory.getLogger(NotificationApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(NotificationApplication.class, args);
	}
	
	@KafkaListener(topics = "notification-topic")
	  void listener(OrderPlacedEvent data) {
	    LOG.info("I received a " + String.valueOf(data.getOrder()));
	  }

}
