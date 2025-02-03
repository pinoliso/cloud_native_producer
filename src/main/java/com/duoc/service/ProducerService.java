package com.duoc.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duoc.config.RabbitMQConfig;

@Service
public class ProducerService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendSignal(String message) {
        rabbitTemplate.convertAndSend(RabbitMQConfig.EXCHANGE_NAME_SIGNALS, RabbitMQConfig.ROUTING_KEY_SIGNALS, message);
    }

    public void sendSummary(String message) {
        rabbitTemplate.convertAndSend(RabbitMQConfig.EXCHANGE_NAME_SUMMARY, RabbitMQConfig.ROUTING_KEY_SUMMARY, message);
    }
}