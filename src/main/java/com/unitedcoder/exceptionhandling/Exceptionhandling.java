package com.unitedcoder.exceptionhandling;

public class Exceptionhandling {
    public static void main(String[] args) {
        int x=100;
        if(x>20){
            throw new NullPointerException("it cant be greater than 20");
        }else {
            throw new ArithmeticException("it can be less tha 20 ");
        }
    }
}
