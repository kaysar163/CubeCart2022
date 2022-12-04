package com.unitedcoder.compare;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComperObjects {
    public static void main(String[] args) {
        ArrayList<Car> carArrayList=new ArrayList<>();
        carArrayList.add(new Car("white","toyota",239000,"rav4",2020));
        carArrayList.add(new Car("black","mcd",78000,"sd5",2022));
        carArrayList.add(new Car("blo","volvo",89000,"uy9",2028));
        //comparablr interface comparator method
        //System.out.println(carArrayList);
       //carArrayList.sort(Comparator.comparing(Car::getClass("ere")));
        Collections.sort(carArrayList);
        System.out.println(carArrayList);
       // carArrayList.sort(Comparator.comparing(Car::getprice));

    }
}
