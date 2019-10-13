package com.apple.user;

public class UserServiceImpl implements UserService{
    @Override
    public int login(UserInfo userInfo) {
        if ("Jame".equals(userInfo.getUsername())){
            System.out.println("welcome!"+userInfo.getUsername());
            if ("123456".equals(userInfo.getUserpassword())){
                System.out.println("login successfully!");
            } else {
                System.out.println("password incorrect!");
            }
        }else {
            System.out.println("incorrect user name!");
        }
        return 0;
    }

    @Override
    public UserInfo register(UserInfo userInfo) {
        return null;
    }
}
