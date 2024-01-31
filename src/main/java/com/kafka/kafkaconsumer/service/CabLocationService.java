package com.kafka.kafkaconsumer.service;

import com.kafka.kafkaconsumer.config.AppConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CabLocationService {
@Autowired
    private KafkaTemplate<String, Map<String,String>> stringStringKafkaTemplate;
    public boolean updateLocation(String location){
        Map<String,String> stringStringMap=new HashMap<>();
        stringStringMap.put("1",location);
        stringStringMap.put("2",location);
        stringStringKafkaTemplate.send(AppConstant.CAB_LOCATION,"as",stringStringMap);
        return true;




    }

}
