package com.apple.user;

public interface UserService {
    public int login(UserInfo userInfo);

    public UserInfo register(UserInfo userInfo);
}
