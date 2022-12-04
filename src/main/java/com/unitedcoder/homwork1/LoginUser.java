package com.unitedcoder.homwork1;

public class LoginUser {
    private String userName;
    private  String Password;


    public LoginUser() {
    }

    public LoginUser(String userName, String password) {
        this.userName = userName;
        this. Password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public String toString() {
        return "LoginUser{" +
                "userName='" + userName + '\'' +
                ", Password='" + Password + '\'' +

                '}';
    }
}
