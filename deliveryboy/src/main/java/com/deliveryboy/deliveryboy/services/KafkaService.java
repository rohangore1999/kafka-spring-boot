package com.deliveryboy.deliveryboy.services;

import com.deliveryboy.deliveryboy.config.AppConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;



@Service
public class KafkaService {
    // KafkaTemplate is a dependency in your class, and Spring needs to provide an instance of it when your application runs.

    @Autowired
    //@Autowired is an annotation that tells Spring to automatically inject the required dependency (in this case, KafkaTemplate<String, String>) when the application context is created.
    private KafkaTemplate<String, String> kafkaTemplate;

    // To produce logs
    // LoggerFactory to create a logger that is associated with the KafkaService class.
    private Logger logger = LoggerFactory.getLogger(KafkaService.class);

    // producer
    public boolean updateLocation(String location){
        // producing the message under given topic
        kafkaTemplate.send(AppConstants.LOCATION_TOPIC_NAME, location);
        logger.info("Message sent to Kafka "+ location);

        return true;
    }
}
