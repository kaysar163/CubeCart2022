package com.unitedcoder.streamapi;

public class Employee {
    private String employeeName;
    private  String EmployeeId;
    private String Department;
    private long salary;
    private int age;

    public Employee() {
    }

    public Employee(String employeeName, String employeeId, String department, long salary, int age) {
        this.employeeName = employeeName;
        EmployeeId = employeeId;
        Department = department;
        this.salary = salary;
        this.age = age;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(String employeeId) {
        EmployeeId = employeeId;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", EmployeeId='" + EmployeeId + '\'' +
                ", Department='" + Department + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
