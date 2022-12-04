package com.unitedcoder.Interfaceconcept;

public class Calcilator implements ISimpleCalculator,IScientificCalculator {


    @Override
    public double calculatePower(int base, int power) {

      double power1=Math.pow(base,power);
              return power1;
    }

    @Override
    public double calculateSquareRoot(long I) {
        double s=Math.sqrt(I);
        return s;
    }

    @Override
    public double calculateAbsoluteValue(int x) {
        double abs=Math.abs(x);
        return  abs;
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
    public long substractTwoNumbers(long I1, long I2) {
        System.out.println(String.format("%d-%d=%d",I1,I2,I1-I2));
        return I1-I2;
    }

    @Override
    public double diviedTwoNumbers(double d1, double d2) {
        if(d2!=0){
            float f=(float) (d1/d2);
            return f;
        }
        else
            System.out.println("your denominator is zero");
        return 0;
    }
}


