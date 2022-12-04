package com.unitedcoder.lambdaexpression;

public class Employee {
    private String name;
    private  int age;
    private Gender gender;
    private long salay;

    public Employee() {
    }

    public Employee(String name, int age, Gender gender, long salay) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salay = salay;
    }





    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public long getSalay() {
        return salay;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", salay=" + salay +
                '}';
    }
}
