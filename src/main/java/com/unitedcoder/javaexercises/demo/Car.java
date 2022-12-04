package com.unitedcoder.javaexercises.demo;

public class Car {
    private String brand;
    private  String made;
    private String color;
    private  long mileAge;
    private long price;
    private  long Year;

    public Car() {
        System.out.println("car object is ceated.........");
    }


    public Car(String brand) {
        this.brand = brand;
    }

    public Car(String brand, String color, long price, long year) {
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.Year = year;
    }

    public Car(String color, long price, long year) {
        this.color = color;
        this.price = price;
        Year = year;
    }

    public Car(String made, long mileAge, long price, long year) {
        this.made = made;
        this.mileAge = mileAge;
        this.price = price;
        Year = year;
    }

    public String carInfo(){
    return brand+","+made+","+color+","+price+" ,";

}
private  String engineType;

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", made='" + made + '\'' +
                ", color='" + color + '\'' +
                ", mileAge=" + mileAge +
                ", price=" + price +
                ", Year=" + Year +
                ", engineType='" + engineType + '\'' +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMade() {
        return made;
    }

    public void setMade(String made) {
        this.made = made;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getMileAge() {
        return mileAge;
    }

    public void setMileAge(long mileAge) {
        this.mileAge = mileAge;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getYear() {
        return Year;
    }

    public void setYear(long year) {
        Year = year;
    }
}
