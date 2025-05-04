package com.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author Gaurav Regmi
 */
@Component
public class MessageConsumer {

    @KafkaListener(topics = "bankxp.topic.email", groupId = "bankxp-test-id")
    public void listen1(String info) {
        System.out.println("Received message1: " + info);
    }

    @KafkaListener(topics = "bankxp.topic.email", groupId = "bankxp-test-id")
    public void listen2(String info) {
        System.out.println("Received message1: " + info);
    }

    @KafkaListener(topics = "bankxp.topic.email", groupId = "bankxp-test-id")
    public void listen3(String info) {
        System.out.println("Received message1: " + info);
    }
}
