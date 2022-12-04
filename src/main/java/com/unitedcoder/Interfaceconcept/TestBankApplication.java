package com.unitedcoder.Interfaceconcept;

public class TestBankApplication {
    public static void main(String[] args) {
        USBank hsbc = new HSBCBank();
        hsbc.credit();
        hsbc.debit();
        hsbc.transaction();
        BrazilBank brazilBank = new HSBCBank() ;
        brazilBank.billutility();
        brazilBank.load();


        }
    }


