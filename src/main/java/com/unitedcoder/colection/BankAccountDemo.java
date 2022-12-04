package com.unitedcoder.colection;

public class BankAccountDemo {
    private static double accountBalance;
    private static String accountName;
    private  static int accountNumber;

    public BankAccountDemo() {
    }

    public static double getAccountBalance() {
        return accountBalance;
    }

    public static void setAccountBalance(double accountBalance) {
        BankAccountDemo.accountBalance = accountBalance;
    }

    public static String getaccountName(String accountName) {
        return accountName;
    }

    public static void setAccountNane(String accountNane) {
        BankAccountDemo.accountName = accountNane;
    }

    public static int getAccountNumber() {
        return accountNumber;
    }

    public static void setAccountNumber(int accountNumber) {
        BankAccountDemo.accountNumber = accountNumber;
    }
    public  static  void getAccountInformation(){
        System.out.println(accountNumber);
        System.out.println(accountName);
        System.out.println(accountBalance);
    }
    public static  void withDrawMoney(double withDrawAmount){
        if(withDrawAmount<accountBalance){
            accountBalance=accountNumber-withDrawAmount;
            System.out.println(accountBalance);
        }
        else {
            System.out.println("you connot withdraw");
        }
    }
}
