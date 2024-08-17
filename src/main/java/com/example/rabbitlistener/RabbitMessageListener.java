package com.example.rabbitlistener;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMessageListener implements MessageListener {

    @Override
    public void onMessage(Message message) {
        System.out.println("message" +  message.getBody() );
    }
}
