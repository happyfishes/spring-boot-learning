package com.itea.repository;

import com.itea.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testSaveUser() {
        User user = new User();
        user.setId(2l);
        user.setUserName("小明");
        user.setPassWord("fffooo123");
        userRepository.saveUser(user);
    }

    @Test
    public void findUserByUserName(){
        User user = userRepository.findUserByUserName("小明");
        System.out.println("user is " + user);
    }

    @Test
    public void updateUser(){
        User user = new User();
        user.setId(2l);
        user.setUserName("天空");
        user.setPassWord("fffxxxx");
        userRepository.updateUser(user);
    }

    @Test
    public void deleteUserById(){
        userRepository.deleteUserById(2l);
    }
}