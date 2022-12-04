package com.unitedcoder.interfaceconcetpt;

import java.util.ArrayList;

public class TestBankApplication {
    public static void main(String[] args) {
        USbank hsbc=new HSBCbank();
        hsbc.credit();
        hsbc.debit();
        hsbc.transaction();
        BrazilBank brazilBank=new HSBCbank();
        brazilBank.bilutility();
        brazilBank.loan();
      //  HSBCbank hsbCbank=new HSBCbank();
    }
}
