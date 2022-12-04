package com.unitedcoder.exceptionhandling;

import org.checkerframework.checker.units.qual.A;

public class ExceptionHnadlingDemo1 {
    public static void main(String[] args) {
        try {
            System.out.println(1 / 0);
        }catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("in the catch block");

    }
        System.out.println("hello world");
    }
}
