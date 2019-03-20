package com.itea.repository;

import com.itea.model.User;
import com.itea.repository.primary.PrimaryRepository;
import com.itea.repository.secondary.SecondaryRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MultiDatabaseTest {

    @Autowired
    private PrimaryRepository primaryRepository;

    @Autowired
    private SecondaryRepository secondaryRepository;

    @Test
    public void TestSave() {
        System.out.println("************************************************************");
        System.out.println("测试开始");
        System.out.println("************************************************************");

        this.primaryRepository.save(new User("小张", "123456"));
        this.secondaryRepository.save(new User("小王", "654321"));

        List<User> primaries = this.primaryRepository.findAll();
        for (User primary : primaries) {
            System.out.println(primary.toString());
        }
        System.out.println("************************************************************");
        List<User> secondaries = this.secondaryRepository.findAll();
        for (User secondary : secondaries) {
            System.out.println(secondary.toString());
        }
        System.out.println("************************************************************");
        System.out.println("测试完成");
        System.out.println("************************************************************");
    }
}