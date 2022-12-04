package com.unitedcoder.interfaceconcetpt;

public class ICICbank extends Bank implements USbank{
    @Override
    public void loan() {
        System.out.println("Bank credit......");

    }

    @Override
    public void transaction() {


    }
}
