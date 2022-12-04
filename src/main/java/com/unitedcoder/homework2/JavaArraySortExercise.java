package com.unitedcoder.homework2;

import java.util.Arrays;

public class JavaArraySortExercise {
    public static void main(String[] args) {
        //generate 10 ramdom  from 10 to 100
        int[] arr =new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*90+10);

        }
        System.out.println(Arrays.toString(arr));
        //sort the number in the ascending order and print out
        //method one
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //method two
        /*for(int i=0; i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;*/
        //method two
        for (int  i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }

            System.out.println();
            //sort the number in the descneding order and print out
            //method one
            for(int i=arr.length-1;i>=0;i--){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

    }

