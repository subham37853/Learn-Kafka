package com.shubho.Kafka.Basics.services;

import com.shubho.Kafka.Basics.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    @Autowired
    KafkaTemplate<String, Message> kafkaTemplate;

    public Message sendKafkaMessage(Message message) {
        this.kafkaTemplate.send("shubham", message);
        System.out.println("Message is sent in the kafka topic");
        return message;
    }
}
