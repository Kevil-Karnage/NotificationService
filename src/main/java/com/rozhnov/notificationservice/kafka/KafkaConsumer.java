package com.rozhnov.notificationservice.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {


    @KafkaListener(topics = "transaction", groupId = "group1")
    public void listenGroupFoo(String message) {
        System.out.println("Received Message in group 'group1': " + message);
    }
}


