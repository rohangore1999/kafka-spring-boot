package com.deliveryboy.deliveryboy.controllers;

import com.deliveryboy.deliveryboy.services.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/location")
public class LocationController {
    @Autowired
    private KafkaService kafkaService;

    @PostMapping("/update-location")
    public String updateLocation(){
        String location = "( "+Math.floor(Math.random()*100)+ "," + Math.floor(Math.random()*100) + ")";
        kafkaService.updateLocation(location);

        return "Location successfully updated: " + location;
    }
}
