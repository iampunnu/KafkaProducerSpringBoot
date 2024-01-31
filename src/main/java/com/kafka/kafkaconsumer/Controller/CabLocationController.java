package com.kafka.kafkaconsumer.Controller;

import com.kafka.kafkaconsumer.service.CabLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/location")
public class CabLocationController {
    @Autowired
    CabLocationService cabLocationService;
    @PutMapping
    public ResponseEntity updateLocatoon(){
        Integer range=3;
        while (range>0){
            cabLocationService.updateLocation(range.toString());
            range--;
        }
        return new ResponseEntity<>(Map.of("message","locationUpdated"), HttpStatusCode.valueOf(200));
    }
}
