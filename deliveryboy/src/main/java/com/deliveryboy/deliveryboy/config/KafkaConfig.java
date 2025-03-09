package com.deliveryboy.deliveryboy.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {
    // return type is "NewTopic" importing from kafka client
    public NewTopic topic() {
        // using TopicBuilder to create a topic
        return TopicBuilder
                .name(AppConstants.LOCATION_TOPIC_NAME)
                //.partitions()
                //.replicas()
                .build();
    }
}
