package com.itea.boot.comm;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertiesTest {


//    @Value("${itea.title}")
//    private String title;
//    @Resource
//    private IteaProperties iteaProperties;
    @Resource
    private OtherProperties otherProperties;

//    @Test
//    public void testString() {
//        System.out.println("title: " + iteaProperties.getTitle());
//        Assert.assertEquals(title, "Spring-Boot-Learning");
//    }

//    @Test
//    public void testMore() {
//        System.out.println("title:" + iteaProperties.getTitle());
//        System.out.println("description: " + iteaProperties.getDescription());
//    }

    @Test
    public void testOther() {
        System.out.println("title: " + otherProperties.getTitle());
        System.out.println("blog: " + otherProperties.getBlog() );
    }

}
