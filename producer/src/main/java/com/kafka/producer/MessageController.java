package com.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Gaurav Regmi
 */
@RestController
public class MessageController {

    @Autowired
    private MessageProducer messageProducer;

    @PostMapping("/send")
    public String sendMessage(@RequestBody Info info) {
        messageProducer.sendMessage("bankxp.topic.email", info);
        return "Message sent: " + info.getMessage();
    }
}
