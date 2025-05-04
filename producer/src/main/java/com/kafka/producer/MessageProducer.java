package com.kafka.producer;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * @author Gaurav Regmi
 */
@Component
public class MessageProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    @Autowired
    @Qualifier("bankxpTopic")
    private NewTopic bankxpTopic;

    public void sendMessage(String topic, Info info) {
        kafkaTemplate.send(bankxpTopic.name(), "hello");
    }
}
