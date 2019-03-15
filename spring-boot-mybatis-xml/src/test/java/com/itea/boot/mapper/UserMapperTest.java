package com.itea.boot.mapper;

import com.itea.boot.enums.UserSexEnum;
import com.itea.boot.model.User;
import com.itea.boot.param.UserParam;
import com.itea.boot.result.Page;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void getAll() {
        List<User> users = userMapper.getAll();
        if(users == null || users.size() == 0){
            System.out.println("is null");
        }else{
            System.out.println("users list is :" + users.toString());
        }
    }

    @Test
    public void getList() {
        UserParam userParam = new UserParam();
//		userParam.setUserSex("WOMAN");
        userParam.setCurrentPage(0);//0 是第一页，1 是第二页 依次类推
        List<User> users = userMapper.getList(userParam);
        long count = userMapper.getCount(userParam);
        Page page = new Page(userParam, count,users);
        System.out.println("page == " + page);
    }

    @Test
    public void getCount() {
//        userMapper.getCount()
    }

    @Test
    public void getOne() {
        User user = userMapper.getOne(100l);
        System.out.println(user.toString());
    }

    @Test
    public void insert() {
        userMapper.insert(new User("aa", "a123456", UserSexEnum.MAN));
        userMapper.insert(new User("bb", "b123456", UserSexEnum.WOMAN));
        userMapper.insert(new User("cc", "b123456", UserSexEnum.WOMAN));

        Assert.assertEquals(213, userMapper.getAll().size());
    }

    @Test
    public void update() {
        long id = 11l;
        User user = userMapper.getOne(id);
        if(user != null){
            System.out.println(user.toString());
            user.setNickName("neo");
            userMapper.update(user);
            Assert.assertTrue(("neo".equals(userMapper.getOne(id).getNickName())));
        }else {
            System.out.println("not find user id="+id);
        }
    }

    @Test
    public void delete() {
        int count = userMapper.delete(23l);
        if(count > 0){
            System.out.println("delete is sucess");
        }else {
            System.out.println("delete if failed");
        }
    }
}