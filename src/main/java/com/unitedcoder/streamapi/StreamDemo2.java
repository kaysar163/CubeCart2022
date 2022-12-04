package com.unitedcoder.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo2 {
    public static void main(String[] args) {
        List<Person> people=new ArrayList<>();
        people.add(new Person("tomi",20));
        people.add(new Person("jenny",19));
        people.add(new Person("jack",15));
       List<Person>sortedList= people.stream().sorted(Comparator.comparing(person -> person.getAge())).collect(Collectors.toList());
        System.out.println(sortedList);

    }
}
class Person{
    private String name;
    private  int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
