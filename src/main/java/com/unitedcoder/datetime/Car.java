package com.unitedcoder.datetime;

public class Car {
    private String color;

    private  String brand;
    private  String model;
    private  String made;
    private long price;
    private  int year;

    public Car() {

    }

    public Car(String color, String brand, long price, int year) {
        this.color = color;
        this.brand = brand;
        this.price = price;
        this.year = year;
    }

    public Car(String model, String made) {
        this.model = model;
        this.made = made;
    }



    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMade() {
        return made;
    }

    public void setMade(String made) {
        this.made = made;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;


    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", made='" + made + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }
}

