package com.itea.repository;

import com.itea.model.User;

/**
 * @ClassName UserRepositoryImpl
 * @Describe
 * @create 2019-03-19 14:55
 * @Version 1.0
 **/
public interface UserRepository {

    public void saveUser(User user);

    public User findUserByUserName(String userName);

    public long updateUser(User user);

    public void deleteUserById(Long id);
}
