package com.example.insulin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/insulin")
public class insulinController 
{
	@Autowired
	KafkaTemplate<String, OrderPlacedEvent> kafkaTemplate;
     
    @GetMapping(path="", produces = "application/json")
    public String getInsulin() 
    {
    	//kafkaTemplate.send("notification-topic", new OrderPlacedEvent(5));
        return "I am the insulin service";
    }

}

