package com.unitedcoder.abstactclass;

public abstract class Bank {
    int i=100;
    final int i1=200;
    final static int i3=400;


    public abstract  void  loan();
    public void credit(){
        System.out.println("bank credit..............");
    }
    public void debit(){
        System.out.println("bank debit");
    }
}
