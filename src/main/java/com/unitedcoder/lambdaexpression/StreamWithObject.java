package com.unitedcoder.lambdaexpression;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamWithObject {
    public static void main(String[] args) {
        List<Employee> employees=getEmployee();
        //filter
        List<Employee>females=employees.stream()
                .filter(employee -> employee.getGender().equals(Gender.FAMALE))
                .collect(Collectors.toList());
       // females.forEach(System.out::println);
        System.out.println("***********************************");
        //sort
        List<Employee>sort=employees.stream().sorted(Comparator.comparing(Employee::getAge).reversed()).
                collect(Collectors.toList());
        sort.forEach(System.out::println);


        //all match
        boolean allMatch=employees.stream().allMatch(employee -> employee.getAge()>19);
        System.out.println(allMatch);
        //anymatch
        boolean anyMatch=employees.stream().anyMatch(employee -> employee.getAge()>20);
        System.out.println(anyMatch);
        boolean noneMatch=employees.stream().noneMatch(employee -> employee.getName().equals("ann"));
        System.out.println(noneMatch);
        //max
        employees.stream().max(Comparator.comparing(Employee::getAge))
                .ifPresent(System.out::println);
        //min
        employees.stream().min(Comparator.comparing(Employee::getSalay))
                .ifPresent(System.out::println);
    }
    private  static List<Employee> getEmployee(){
        return Arrays.asList(
                new Employee("anna",20, Gender.FAMALE,1500),
                new Employee("Helen",25,Gender.FAMALE,2000),
                new Employee("jakop",20, Gender.MALE,1500),
                new Employee("davod",24,Gender.MALE,3000)


        );

    }
}
