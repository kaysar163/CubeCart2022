package com.unitedcoder.datetime;

public class TestCar2 {
    public static void main(String[] args) {
        Car[] cars=new Car[3];
        Car car1=new Car( "bleack","vovle",120000,20201);
        Car car2=new Car( "read","mercedes",1250000,20209);
        Car car3=new Car( "yellow","tesla",1250000,20209);
        cars[0]=car1;
        cars[1]=car2;
        cars[2]=car3;


        for(Car c:cars){
            System.out.println(c.toString());
           // System.out.println(c.getYear()+" "+c.getPrice()+" "+c.getBrand()+" "+c.getMade()+" "+c.getModel()+" "+c.getClass());
           // System.out.println();
        }


    }
}
