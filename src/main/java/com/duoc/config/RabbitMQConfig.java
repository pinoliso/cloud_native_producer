package com.duoc.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    public static final String EXCHANGE_NAME = "cloud_native_exchange";
    public static final String QUEUE_NAME = "cloud_native_queue";
    public static final String ROUTING_KEY = "cloud_native_routing_key";

}
