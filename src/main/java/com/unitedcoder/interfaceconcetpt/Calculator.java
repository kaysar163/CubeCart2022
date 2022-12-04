package com.unitedcoder.interfaceconcetpt;

public class Calculator implements  IscientificCalculator,IsimpleCalculator{
    @Override
    public double calculatePower(int bas, int power) {
        double power1=Math.pow(bas,power);
        System.out.println(power1);
        return power1;
        }

        @Override
    public double calculateSquareRoot(long I) {
        double s=Math.sqrt(1);
            System.out.println(s);
        return s;
    }

    @Override
    public double calculaAbsoluteValue(int x) {
        double abs=Math.abs(x);
        System.out.println(abs);
        return abs;
    }

    @Override
    public double addTwoNumbers(double d1, double d2) {
        double sum=d1+d2;
        System.out.println(String.format("%.2f+%.2f=%.2f",d1,d2,sum));
        return sum;
    }

    @Override
    public int multiplyTwoNumbers(int i1, int i2) {
        int result=i1*i2;
        System.out.println(String.format("%d*%d=%d",i1,i2,result));
        return result;
    }

    @Override
    public long substractTwoNubers(long f1,long f2) {
        System.out.println(String.format("%d-%d=%d",f1,f2,f1-f2));
        return f1-f2;
    }

    @Override
    public double divideTwoNumbers(double d1, double d2) {
        if(d2!=0){
        float f=(float) (d1/d2);
            System.out.println(f);
        return  f;
    }
        else {
            System.out.println("your denominator is zero");
            return  0;
        }
}
}
