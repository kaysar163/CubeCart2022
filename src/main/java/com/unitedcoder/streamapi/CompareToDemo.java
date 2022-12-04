package com.unitedcoder.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CompareToDemo {
    public static void main(String[] args) {
        List<Employee> employeeList=new ArrayList<>();
        Employee employee1=new Employee("mike1","01","hrd",30090,31);
        Employee employee2=new Employee("mike2","012","hr",30200,30);
        Employee employee3=new Employee("mike3","013","hrc",30040,20);
        employeeList.addAll(Arrays.asList(employee1,employee3,employee2));
        employeeList.sort(Comparator.comparing(Employee::getAge));
        System.out.println(employeeList.toString());
        employeeList.sort(Comparator.comparing(Employee::getEmployeeName));
        System.out.println(employeeList);
        employeeList.sort(Comparator.comparing(Employee::getSalary));
        System.out.println(employeeList);

    }
}
