package com.unitedcoder.interfaceconcetpt;

public class BankTestDemo {
    public static void main(String[] args) {
        Bank bank=new ICICbank() ;
        bank.credit();
        bank.debit();
        bank.i=500;
        System.out.println(bank.i);
        System.out.println(bank.i1);
        System.out.println(Bank.i3);






            }
}





