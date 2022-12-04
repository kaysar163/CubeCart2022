package com.unitedcoder.datatypes;

import java.util.Scanner;

public class ScannerObject {
    public static void main(String[] args) {
        //difine scanner object
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter one digit number");
        int x=scanner.nextInt();
        System.out.println("please enter second number");
        int y=scanner.nextInt();

        System.out.printf("please enter the result of %d+%d:\n",x,y);


        int z=scanner.nextInt();
        if(z==x+y){
            System.out.println("your answer is correct");
        }
        else{
            System.out.println("your answer is wrong ");
        }
    }
}

