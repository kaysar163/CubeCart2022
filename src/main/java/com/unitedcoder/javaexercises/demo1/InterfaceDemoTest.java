package com.unitedcoder.javaexercises.demo1;

public class InterfaceDemoTest implements InterfaceDemo{
    @Override
    public double addTwoNumbers(double a, double b) {
        double c=a+b;
        System.out.printf("%.1f+%.1f=%.1f",a,b,c );
        return c;
    }

    @Override
    public double multiplyTwoNumber(double a, double b) {

        System.out.println(" multiplification value is"+a*b);
        return a*b;
    }

    @Override
    public float divideTwoNumbers(double a, double b) {
        if(b==0){
            System.out.println("denominator cannot be zero");

        return 0;
    }
        else{
            float division=(float) (a/b);
            System.out.println("division values is : "+division);
            return  division;
        }
    }

    @Override
    public double subtracTwoNumbers(double a, double b) {
        double c=a-b;
        System.out.printf("%.1f-%.1f=%.1f",a,b,c);
        return c;
    }

    public static void main(String[] args) {
        InterfaceDemoTest interfaceDemoTest=new InterfaceDemoTest();
        interfaceDemoTest.divideTwoNumbers(10,2);
        interfaceDemoTest.addTwoNumbers(5,6);
        interfaceDemoTest.multiplyTwoNumber(10,30);
        interfaceDemoTest.subtracTwoNumbers(100,200);

    }
}

