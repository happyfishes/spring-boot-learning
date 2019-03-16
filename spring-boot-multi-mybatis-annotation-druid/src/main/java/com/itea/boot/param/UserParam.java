package com.itea.boot.param;

/**
 * @ClassName UserParam
 * @Describe
 * @create 2019-03-16 16:45
 * @Version 1.0
 **/
public class UserParam extends PageParam{

    private String userName;

    private String userSex;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }
}
