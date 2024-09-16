package com.product_project.consumer_machines_registration.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQConsumer {

    private static final Logger logger = LoggerFactory.getLogger(RabbitMQConsumer.class);

    @Value("${queue.name}")
    private String queueName;

    @RabbitListener(queues = "${queue.name}")
    public void consumeMessage(String message) {



        logger.info("Received message from queue {}: {}", queueName, message);
    }
}