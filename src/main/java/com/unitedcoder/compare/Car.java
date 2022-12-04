package com.unitedcoder.compare;

import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;

import javax.swing.*;

public class Car implements Comparable<Car> {
    //class level variable global variable

    private String color;
    private String brand;
    private long price;
    private String model;
    private int year;

    public  void carStart(){
        System.out.println("car start.........");
    }
    public Car(){

    }

    public Car(String color, String brand, long price, String model, int year) {
        this.color = color;
        this.brand = brand;
        this.price = price;
        this.model = model;
        this.year = year;
    }

    public Car(String color, String brand, long price) {
        this.color = color;
        this.brand = brand;
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(Car car) {
        if(price==car.price)
            return 0;
        else if(price<car.price)
            return 1;
        else
            return  -1;

    }



    }






