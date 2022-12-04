package com.unitedcoder.javaexercises.demo;

import org.checkerframework.checker.units.qual.C;

public class TestCar {
    public static void main(String[] args) {

        Car car1=new Car("mercidis");
        Car car2=new Car("vovle","read",20000,2020);
        System.out.println(car1.getBrand());
        System.out.println(car2.getBrand());
        System.out.println(car2);


}
}
