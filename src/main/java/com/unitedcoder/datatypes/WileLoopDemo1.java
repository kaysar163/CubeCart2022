package com.unitedcoder.datatypes;

import java.util.Scanner;

public class WileLoopDemo1 {
    public static void main(String[] args) {
        //scanner 0
        Scanner scanner=new Scanner(System.in);
        int positiveNumber=0;
        int negativeNumber=0;
        while(true){
                    int number=scanner.nextInt();
                    if(number>0) {
                        positiveNumber++;
                    }
                       else if (number<0){
                          negativeNumber++;

                        }
                       else    {
                           break;
                    }
                }
        System.out.println("positive number"+positiveNumber);
        System.out.println("WnegativeNumber"+negativeNumber);

    }

}
