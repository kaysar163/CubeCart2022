package com.unitedcoder.otherexecise;

public class BankAccountDemo {
    private  static double accountBalance;
    private static String accountName;
    private  static int accountNumber;


    public BankAccountDemo(){

    }

    public static double getAccountBalance() {
        return accountBalance;
    }

    public static void setAccountBalance(double accountBalance) {
        BankAccountDemo.accountBalance = accountBalance;
    }

    public static String getAccountNmae() {
        return accountName;
    }

    public static void setAccountNmae(String accountNmae) {
        BankAccountDemo.accountName = accountNmae;
    }

    public static int getAccountNumber() {
        return accountNumber;
    }

    public static void setAccountNumber(int accountNumber) {
        BankAccountDemo.accountNumber = accountNumber;
    }
public static  void getAccountInformation(){
    System.out.println(accountNumber);
    System.out.println(accountName);
    System.out.println(accountBalance);
}
public  static  void withDrawMoney(double withDrawAmount){
        if(withDrawAmount<accountBalance){
            accountBalance=accountBalance-withDrawAmount;
            System.out.println(accountBalance);
        }
        else {
            System.out.println("you connot withdraw");
        }
}

}
