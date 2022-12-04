package com.unitedcoder.javaexercises.demo;

public class TestCar1 {
    public static void main(String[] args) {


    //car array odject
    Car[] cars=new Car[3];
    Car car1=new Car("BNW","balck",10000,2020);
    Car  car2=new Car("merce","silver",5008,2019);
    Car  car3=new Car("mercytyte","silvytyter",50098,20719);
    cars[0]=car1;
        cars[1]=car2;
        cars[2]=car3;
        for(Car c:cars){
            System.out.println(c.toString());
        }

}
}
