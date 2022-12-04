package com.unitedcoder.abstactclass;

import com.unitedcoder.Interfaceconcept.USBank;

public class ICIBank extends  Bank implements USBank {
    @Override
    public void loan() {
        System.out.println("bank loan........");
    }

    @Override
    public void transaction() {

    }
}
