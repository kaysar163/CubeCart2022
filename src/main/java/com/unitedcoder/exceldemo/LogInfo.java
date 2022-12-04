package com.unitedcoder.exceldemo;

public class LogInfo {
    private String userName;
    private String password;

    public LogInfo() {
    }

    public LogInfo(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "LogInfo{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}


