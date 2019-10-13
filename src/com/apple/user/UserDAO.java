package com.apple.user;

public interface UserDAO {

    //保存用户信息
    public String savwUserInfo(UserInfo userInfo);

    public UserInfo findUserInfobyName(String username);

    //public UserInfo findUserInfobyID(String userID);
}
