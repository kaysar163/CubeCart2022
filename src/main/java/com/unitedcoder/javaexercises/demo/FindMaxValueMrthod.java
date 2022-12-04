package com.unitedcoder.javaexercises.demo;

public class FindMaxValueMrthod {
    //method for find a amx value in anfi array
    public  int findMaxValue(int[] array){
        int maxValue=0;
        for(int i=0;i< array.length;i++){
            if(maxValue<array[i]){
                maxValue=array[i];
            }
        }
        return  maxValue;
    }
}
