package com.unitedcoder.arrayexercises;

import java.lang.reflect.Array;
import java.util.Arrays;

import static java.lang.reflect.Array.*;

public class JavaArrayProject {
    public static void main(String[] args) {


    //1.write a loop that fills an arry with 30 random number between 1 and 100;
    int[]arr=new int[30];

    for(int i =0;i<arr.length;i++){

        arr[i] = (int) (Math.random() * 100 + 1);
    }
        System.out.println(Arrays.toString(arr));
    //2.cout all the even number and print the total count
        int numberCount=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]%2==0){
                numberCount++;
            }
        }
        System.out.println("the total count of the even number is: "+numberCount);
        //3.count all the odd number and print the total count;
        int numberCount1=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                numberCount1++;
            }
        }
        System.out.println("the total count of the odd number is :"+numberCount1);
        //4.count all the number that are divided by three and print the total count
        int numberCount2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%3==0){
              numberCount2++;
                System.out.println("the total count of the numbers that are divided by three is ;"+numberCount2);
                //5.calculate the sum and avarage of the 30 random number
                int sum =0;
                for(   i=0; i<arr.length; i++){
                    sum+=arr[i];
                }
                System.out.println("the sum of the 30 random numbers is :"+sum);
                System.out.println("the average of the 30 random numbers is :"+sum/30);
            }
            //6.sort the number with ascending order and print out all the number;
            //method one
           // Arrays.sort(arr);
          // System.out.println(Arrays.toString(arr));
            //METHOD TWO
            for( i=0; i<arr.length-1+i;i++){
                for(int  j=0;j<arr.length-1-i;j++){
                    if(arr[j]>arr[j+1]){
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                        for(i=0;i<arr.length;i++){
                            System.out.print(arr[i]+",");
                        }
                        System.out.println();
                        //7.sort the number with descending order and print out the number
                        //methos one
                       // for( i=arr.length-1;i>=0;i--){
                           // System.out.println(arr[i]+" ");
                        }
                      //  System.out.println();
                        }
               /* for( i=0;i<arr.length-1;i++){
                    for(int j=0;j<arr.length-1-i;j++){
                        if(arr[j]<arr[j+1]){
                            int temp=arr[j];
                            arr[j]=arr[j+1];
                            arr[j+1]=temp;
                        }
                    }
                }
                System.out.println(Arrays.toString(arr));*/
                    }
                }
            }
        }








