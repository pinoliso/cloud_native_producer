package com.duoc.controller;

import com.duoc.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductorController {

    @Autowired
    private ProducerService producer;

    @PostMapping("/signal")
    public String sendSignal(@RequestParam("message") String message) {
        producer.sendSignal(message);
        return "Signal enviado: " + message;
    }

    @PostMapping("/summary")
    public String sendSummary(@RequestParam("message") String message) {
        producer.sendSummary(message);
        return "Summary enviado: " + message;
    }
}
