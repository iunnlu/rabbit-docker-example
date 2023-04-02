package com.example.rabbitmqexample;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

//http://localhost:8080/order
@RestController
@RequestMapping("/order")
public class OrderRestController {
    private final RabbitTemplate rabbitTemplate;

    public OrderRestController(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @PostMapping()
    public Order postOrder(@RequestBody Order order) {
        rabbitTemplate.convertAndSend("rabbit-exchange","routingExample", order);
        return order;
    }
}