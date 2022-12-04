package com.unitedcoder.datetime;

import org.bouncycastle.est.CACertsResponse;
import org.checkerframework.checker.units.qual.C;

import java.util.ArrayList;
import java.util.List;

public class TestCar {
    public static  void main(String[] args) {

        Car BMW=new Car();
        BMW.setBrand("BMV");
        BMW.setMade("gernam");
        BMW.setColor("back");
        BMW.setPrice(50000);
        BMW.setYear(2021);
        BMW.setModel("x6");

        Car MCD=new Car();
        MCD.setBrand("mercedes");
        MCD.setMade("back");
        MCD.setColor("back");
        MCD.setPrice(9000);
        MCD.setYear(2028);
        MCD.setModel("x9");

        Car vlv=new Car();
        vlv.setBrand("Volvo");
        vlv.setMade("blo");
        vlv.setColor("back");
        vlv.setPrice(40000);
        vlv.setYear(20212);
        vlv.setModel("hi6");

        List<Car> cars=new ArrayList<>();
        cars.add(BMW);
        cars.add(vlv);
        cars.add(MCD);
        for(Car car:cars){
            //if(car.getBrand().equalsIgnoreCase("mercedes")){
                System.out.println(car);
        }



       /* System.out.println(BMW.getBrand());
        System.out.println(BMW.getColor());
        System.out.println(BMW.getMade());
        System.out.println(BMW.getPrice());
        System.out.println(BMW.getYear());
        System.out.println(BMW.toString());*/




    }
    }



