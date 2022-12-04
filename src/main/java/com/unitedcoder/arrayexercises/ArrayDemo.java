package com.unitedcoder.arrayexercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter array length");

        int length=scanner.nextInt();
        int[] arr=new int[length];

        int  minValue=0;
        for(int i=0; i<arr.length;i++){
            arr[i]=(int)(Math.random()*100+1);
             if(i==0) {
                 minValue = arr[0];
             }
            if(minValue>arr[i]){
                minValue=arr[i];
            }

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(minValue);
    }
    }





