package com.itea.boot.mapper.two;

import com.itea.boot.enums.UserSexEnum;
import com.itea.boot.mapper.UserSql;
import com.itea.boot.model.User;
import com.itea.boot.param.UserParam;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @ClassName UserTwoMapper
 * @Describe
 * @create 2019-03-16 16:44
 * @Version 1.0
 **/
public interface UserTwoMapper {

    @Select("SELECT * FROM users")
    @Results({
            @Result(property = "userSex",  column = "user_sex", javaType = UserSexEnum.class),
            @Result(property = "nickName", column = "nick_name")
    })
    List<User> getAll();

    @SelectProvider(type = UserSql.class, method = "getList")
    List<User> getList(UserParam userParam);

    @SelectProvider(type = UserSql.class, method = "getCount")
    int getCount(UserParam userParam);

    @Select("SELECT * FROM users WHERE id = #{id}")
    @Results({
            @Result(property = "userSex",  column = "user_sex", javaType = UserSexEnum.class),
            @Result(property = "nickName", column = "nick_name")
    })
    User getOne(Long id);

    @Insert("INSERT INTO users(userName,passWord,user_sex) VALUES(#{userName}, #{passWord}, #{userSex})")
    void insert(User user);

    @Update("UPDATE users SET userName=#{userName},nick_name=#{nickName} WHERE id =#{id}")
    void update(User user);

    @Delete("DELETE FROM users WHERE id =#{id}")
    void delete(Long id);
}
