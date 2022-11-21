package com.shubho.Kafka.Basics.controller;

import com.shubho.Kafka.Basics.model.Message;
import com.shubho.Kafka.Basics.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageController {
    @Autowired
    MessageService messageService;

    @PostMapping("/sendMessage")
    public Message sendMessage(@RequestBody Message message) {
        return this.messageService.sendKafkaMessage(message);
    }
}
