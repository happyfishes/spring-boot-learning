package com.itea.sender;

import com.itea.sender.neo.NeoSender1;
import com.itea.sender.neo.NeoSender2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName ManyTest
 * @Describe
 * @create 2019-03-18 17:06
 * @Version 1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class ManyTest {
    @Autowired
    private NeoSender1 neoSender1;

    @Autowired
    private NeoSender2 neoSender2;

    @Test
    public void oneToMany() throws Exception {
        for (int i=0;i<100;i++){
            neoSender1.send(i);
        }
        Thread.sleep(10000l);
    }

    @Test
    public void manyToMany() throws Exception {
        for (int i=0;i<100;i++){
            neoSender1.send(i);
            neoSender2.send(i);
        }
        Thread.sleep(10000l);
    }
}
