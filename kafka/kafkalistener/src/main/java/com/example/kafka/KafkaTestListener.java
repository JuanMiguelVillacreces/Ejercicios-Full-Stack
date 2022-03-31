package com.example.kafka;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaTestListener {

    @KafkaListener(topics = "${message.topic.name:kafkatopic}", groupId = "${message.group.name:kafkagroup}")
    public void listenTopic1(String message) {
        System.out.println("Listener: Recibido mensaje desde topic1: " + message);
    }

    @KafkaListener(topics = "${message.topic.name2:kafkatopic2}", groupId = "${message.group.name:kafkagroup}")
    public void listenTopic2(String message) {
        System.out.println("Listener: Recibido mensaje desde topic2 "+message);
    }
}