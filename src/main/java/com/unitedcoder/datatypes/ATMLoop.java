package com.unitedcoder.datatypes;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class ATMLoop {
    public static void main(String[] args) {
        int correctPin=1234;
        int balance=100000;
        //Pin number
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your pin number");
        int chance=3;
        int i=0;
        do {
            i++;
            String pin=input.nextLine();
            if (StringUtils.isNumeric(pin) && Integer.parseInt(pin) == correctPin) {
                System.out.println("Please select the menu: Transer money, deposit money, withdraw money");
                String selectedMenu = input.nextLine();
                if (selectedMenu.equalsIgnoreCase("withdraw money")) {
                    System.out.println("Please select withdraw amount!!");
                    int withDrawAmount = input.nextInt();
                    if (withDrawAmount <= balance) {
                        System.out.println("Please take you money!!Enjoy!!!!");
                        System.out.printf("Your current balance is %d\n ", balance - withDrawAmount);
                    } else {
                        System.out.println("Insufficient amount!");
                        System.out.println("Withdraw amount is greater than your balance!!!");
                    }
                } else {
                    if (selectedMenu.equalsIgnoreCase("deposit money")) {
                        System.out.println("Please put ypur money into the machine");
                        int money = input.nextInt();
                        System.out.printf("You have deposited %d amount\n", money);
                        System.out.printf("Ypir current balance is %d", balance + money);
                    }
                }
            }
            else {
                System.out.println("Your pin number is invalid,Please enter Valid 4 digit numbers");
                System.out.printf("Incorrect Pin number, you can only try %d time\n",chance-i);
                System.out.println("Please enter your pin number again: ");
            }
        }while (i<chance);//0 1 2

    }
}


