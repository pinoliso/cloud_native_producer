package com.duoc.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    public static final String EXCHANGE_NAME_SIGNALS = "signals";
    public static final String ROUTING_KEY_SIGNALS = "signals";

    public static final String EXCHANGE_NAME_SUMMARY = "summary";
    public static final String ROUTING_KEY_SUMMARY = "summary";

}
