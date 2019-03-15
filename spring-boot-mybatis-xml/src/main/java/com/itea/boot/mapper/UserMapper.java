package com.itea.boot.mapper;

import com.itea.boot.model.User;
import com.itea.boot.param.UserParam;

import java.util.List;

/**
 * @ClassName UserMapper
 * @Describe
 * @create 2019-03-15 22:30
 * @Version 1.0
 **/
public interface UserMapper {

    List<User> getAll();

    List<User> getList(UserParam userParam);

    int getCount(UserParam userParam);

    User getOne(Long id);

    void insert(User user);

    int update(User user);

    int delete(Long id);
}
