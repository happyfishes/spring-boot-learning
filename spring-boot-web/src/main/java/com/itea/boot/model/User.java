package com.itea.boot.model;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

/**
 * @ClassName User
 * @Describe
 * @create 2019-03-11 15:52
 * @Version 1.0
 **/
public class User {

    @NotEmpty(message = "姓名不能为空")
    private String name;
    @Max(value = 100, message = "年龄不能大于100岁")
    @Max(value = 18, message = "年龄不能小于18岁")
    private int age;
    @NotEmpty(message = "密码不能为空")
    @Length(min = 6, message = "密码长度不能小于6位")
    private String pass;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
