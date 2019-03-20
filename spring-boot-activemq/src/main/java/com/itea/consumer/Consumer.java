package com.itea.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName Consumer
 * @Describe
 * @create 2019-03-18 16:17
 * @Version 1.0
 **/
@Component
public class Consumer {

    @JmsListener(destination = "neo.queue", containerFactory = "queueListenerFactory")
    public void receiveQueue(String text) {
        System.out.println("Consumer queue msg : " + text);
    }

    @JmsListener(destination = "neo.topic", containerFactory = "topicListenerFactory")
    public void receiveTopic(String text) {
        System.out.println("Consumer topic msg : " + text);
    }
}
