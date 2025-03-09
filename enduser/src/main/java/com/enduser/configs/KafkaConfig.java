package com.enduser.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {
    @KafkaListener(topics = AppConstants.LOCATION_UPDATE_TOPIC, groupId = AppConstants.GROUP_ID) // To listen Kafka messages
    public void messageConsumer(String location) {
        // save the message to db or do anything...
        System.out.println("Location: "+location);
    }
}
