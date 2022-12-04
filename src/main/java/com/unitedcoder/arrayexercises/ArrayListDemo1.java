package com.unitedcoder.arrayexercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo1 {
    public static void main(String[] args) {
       /* ArrayList<Integer>arrayList=new ArrayList<>();
        arrayList.add(200);
        arrayList.add(500);
        arrayList.add(100);
        //size
       // System.out.println(arrayList.set(""));*/
        System.out.println("please enter your number");
        Scanner scanner=new Scanner(System.in);
        int inputNumber=scanner.nextInt();
        System.out.println("prime number");
        for(int i=2;i<inputNumber;i++){
            boolean isPrime=true;
            for(int j=2;j<i;j++){
                if(i%j==0)
                    isPrime=false;
            }
            if(isPrime){
                System.out.print(i+",");
            }
        }

        }

    }

