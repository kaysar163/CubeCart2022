package com.unitedcoder.colection;

public class StaticMethodAndVariable777 {
    public static int money;
    //static variables
    private static  double accountBalance;
    private  static String accountName;
    private static int accountNumber;
    public int deposit;

    public StaticMethodAndVariable777() {
    }
   //static method
    public static double getAccountBalance() {
        return accountBalance;
    }

    public static void setAccountBalance(double accountBalance) {
        StaticMethodAndVariable777.accountBalance = accountBalance;
    }

    public static String getAccountName() {
        return accountName;
    }

    public static void setAccountName(String accountName) {
        StaticMethodAndVariable777.accountName = accountName;
    }

    public static int getAccountNumber() {
        return accountNumber;
    }

    public static void setAccountNumber(int accountNumber) {
        StaticMethodAndVariable777.accountNumber = accountNumber;
    }
}
