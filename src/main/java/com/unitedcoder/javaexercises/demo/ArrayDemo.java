package com.unitedcoder.javaexercises.demo;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {

         int[]a={10,20,80,50,60,40};
         for(int i=0;i<=a.length-1;i++){
             for (int  j=0;j<a.length-1-i;j++){
                 if(a[j]>a[j+1]){
                     int temp=a[j];
                     a[j]=a[j+1];
                     a[j+1]=temp;
                 }
             }
         }
        System.out.println(Arrays.toString((a)));
    }



    }









