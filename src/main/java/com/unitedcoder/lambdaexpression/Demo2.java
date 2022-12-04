package com.unitedcoder.lambdaexpression;

public interface Demo2 {
    void sum(int a, int b);
    // void sum1();



}
class  Test1{
    public static void main(String[] args) {
        Demo2 demo2=(a,b)-> System.out.println("sum of  the givien value is "+(a+b));
        demo2.sum(100,200);

    }

}