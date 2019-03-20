package com.itea.sender.neo;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName NeoSender1
 * @Describe
 * @create 2019-03-18 16:39
 * @Version 1.0
 **/
@Component
public class NeoSender2 {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(int i) {
        String context = "spirng boot neo queue" + " ****** " + i;
        System.out.println("Sender2: " + context);
        this.rabbitTemplate.convertAndSend("neo", context);
    }
}
