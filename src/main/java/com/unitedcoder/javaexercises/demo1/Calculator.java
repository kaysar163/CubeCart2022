package com.unitedcoder.javaexercises.demo1;

import org.codehaus.plexus.util.StringUtils;

public class Calculator {
    //method for print calculator info
    public  void  calCulatorinfo(){
        System.out.println("sony simple calculator");
        System.out.println("hope you enjoy to use!!!!");
    }
    //method for add  two numbers
    public int  sum(int i1,int i2){
        return i1+i2;

    }
   public  long addTwoNumber(String s1,String s2){
        if (StringUtils.isNumeric(s1)&&StringUtils.isNumeric(s2)) {
            long sum = Long.parseLong(s1) + Long.parseLong(s2);
            return sum;
        }else {
            System.out.println("please provide nummeric string");
            return  0;
        }
   }


        //add multipe
        public long addMultipleNumbber(long...numbers){
        long sum=0;
        for(long eachNumbers: numbers){
            sum=eachNumbers;
        }
        return  sum;
       }
}



