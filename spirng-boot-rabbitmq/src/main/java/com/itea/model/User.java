package com.itea.model;

import java.io.Serializable;

/**
 * @ClassName User
 * @Describe
 * @create 2019-03-18 16:47
 * @Version 1.0
 **/
public class User implements Serializable {

    private String name;

    private String pass;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
