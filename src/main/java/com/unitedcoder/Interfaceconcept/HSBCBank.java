package com.unitedcoder.Interfaceconcept;

public class HSBCBank implements USBank,BrazilBank      {

    @Override
    public void credit() {
        System.out.println("HSBC----Credit");

    }

    @Override
    public void debit() {
        System.out.println("HSBS---dEBIT");

    }

    @Override
    public void transaction() {
        System.out.println("hsbc------transaction");

    }


    @Override
    public void load() {
        System.out.println("loan");
    }

    @Override
    public void billutility() {
        System.out.println("*----billutility");

    }
}

