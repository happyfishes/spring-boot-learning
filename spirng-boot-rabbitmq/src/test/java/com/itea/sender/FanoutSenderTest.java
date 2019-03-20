package com.itea.sender;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FanoutSenderTest {

    @Autowired
    private FanoutSender sender;

    @Test
    public void send() throws InterruptedException {
        sender.send();
        Thread.sleep(1000L);
    }
}