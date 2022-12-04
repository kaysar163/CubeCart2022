package com.unitedcoder.javaexercises.demo;

import org.codehaus.plexus.util.StringUtils;

public class Calculator {
    //mrthod for print calculator info
    public  void calcuInfo(){
        System.out.println("thanks for using this calculator");
        System.out.println("hope you enjoy usjing it !!!!");
    }
    public int addTwoNubers(int i1,int i2){
        int sum=i1+i2;
        return  sum;

    }
    public  long addNumbers(String  s1,String s2){
        if( StringUtils.isNumeric(s1)&StringUtils.isNumeric(s2)) {
            long sum=Long.parseLong(s1)+Long.parseLong(s2);
            return sum;
        }
        else{
            System.out.println("please provide number string");
            return 0;
        }

     }
     public long addMultipleNumbers(long...numbers){
        long sum=0;
        for(long eachNumber:numbers){
            sum+=eachNumber;
        }
        return sum;

     }
        }


