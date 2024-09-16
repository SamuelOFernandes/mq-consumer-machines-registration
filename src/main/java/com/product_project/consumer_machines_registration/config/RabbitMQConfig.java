package com.product_project.consumer_machines_registration.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    // Criação da fila
    @Bean
    public Queue machinesQueue() {
        return new Queue("machinesQueue", true);
    }
}