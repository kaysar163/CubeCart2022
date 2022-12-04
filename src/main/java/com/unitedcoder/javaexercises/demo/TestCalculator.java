package com.unitedcoder.javaexercises.demo;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        calculator.calcuInfo();
        FindMaxValueMrthod method=new FindMaxValueMrthod();
        System.out.println(method.findMaxValue(new int []{30,40,56,90,52,70}));
    }
}
