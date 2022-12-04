package com.unitedcoder.exceptionhandling;

public class ExceptionDemo5 {
    public static void main(String[] args) {
        try{
        System.out.println(1/0);

            System.out.println(Integer.parseInt("a1234"));
    }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(156468489);

    }
}
