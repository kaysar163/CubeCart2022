package com.unitedcoder.javaexercises.demo1;

public class MethodOverridingDemoTest extends MethodOverridingDemo{
    public void printTestInfo(){
        System.out.println("test case id=1");
        System.out.println("test case name=Login");
        System.out.println("test case description: user login test");
    }

    public static void main(String[] args) {
        MethodOverridingDemo methodOverridingDemo=new MethodOverridingDemoTest();
        methodOverridingDemo. printTestInfo();
        //USE parent method
        MethodOverridingDemo demo2=new  MethodOverridingDemo();
        demo2.printTestInfo();

    }
}
