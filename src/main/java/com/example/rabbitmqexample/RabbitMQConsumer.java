package com.example.rabbitmqexample;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.MessagingException;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class RabbitMQConsumer {
    @RabbitListener(queues = "rabbit-example")
    public void consumer(Order order) throws MessagingException, IOException {
        System.out.println(order.toString());
    }
}