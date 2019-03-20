package com.itea.producer;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.rule.OutputCapture;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProducerTest {

    @Rule
    public OutputCapture outputCapture = new OutputCapture();

    @Autowired
    private Producer producer;

    @Test
    public void sendQueue() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            this.producer.sendQueue("Test queue message " + i);
        }
        Thread.sleep(1000L);
    }

    @Test
    public void sendTopic() {
        for (int i = 0; i < 100; i++) {
            this.producer.sendTopic("Test topic message " + i);
        }
    }
}