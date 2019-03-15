package com.itea.boot.web;

import com.itea.boot.mapper.UserMapper;
import com.itea.boot.model.User;
import com.itea.boot.param.UserParam;
import com.itea.boot.result.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName UserController
 * @Describe
 * @create 2019-03-15 22:02
 * @Version 1.0
 **/
@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/getUsers")
    public List<User> getUsers() {
        List<User> users=userMapper.getAll();
        return users;
    }

    @RequestMapping("/getList")
    public Page<User> getList(UserParam userParam) {
        List<User> users=userMapper.getList(userParam);
        long count=userMapper.getCount(userParam);
        Page page = new Page(userParam,count,users);
        return page;
    }

    @RequestMapping("/getUser")
    public User getUser(Long id) {
        User user=userMapper.getOne(id);
        return user;
    }

    @RequestMapping("/add")
    public void save(User user) {
        userMapper.insert(user);
    }

    @RequestMapping(value="update")
    public void update(User user) {
        userMapper.update(user);
    }

    @RequestMapping(value="/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        userMapper.delete(id);
    }
}
