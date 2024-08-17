package com.example.rabbitlistener;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitListenerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitListenerApplication.class, args);
    }

}

