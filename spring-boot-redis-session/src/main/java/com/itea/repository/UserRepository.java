package com.itea.repository;

import com.itea.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ClassName UserRepository
 * @Describe
 * @create 2019-03-18 15:07
 * @Version 1.0
 **/
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserName(String userName);
}
