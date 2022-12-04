package com.unitedcoder.interfaceconcetpt;

public class HSBCbank implements USbank,BrazilBank{
    @Override
    public void credit() {
        System.out.println("HSBC------Credit");

    }

    @Override
    public void debit() {
        System.out.println("HSBC----Debit");

    }

    @Override
    public void transaction() {
        System.out.println("HSBC-------transaction");

    }

    @Override
    public void loan() {
        System.out.println("HSBC---loan");
    }

    @Override
    public void bilutility() {
        System.out.println("HSBC----bilutility");

    }
}
