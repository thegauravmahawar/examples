package com.example.rabbitmq.producers;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class MessageProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Scheduled(fixedDelay = 1000, initialDelay = 500)
    public void send() {
        rabbitTemplate.convertAndSend("rabbit-spring-example", "Hello World!");
        System.out.println("Message sent");
    }
}
