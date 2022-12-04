package com.unitedcoder.otherexecise;

import java.util.Arrays;

public class StudentApplication {
    public static void main(String[] args) {
        Student student=new Student(101,"mike","smith","it",18,"sdet","2006");
        System.out.println(student);
        System.out.println("below are graduate student info");


        GraduateStudent graduateStudent=new GraduateStudent(201,"david","smith","java",20,"develpper","2008",
                "dolku","E-commerce application");
        System.out.println(graduateStudent);
        System.out.println("belows are doctor student info");

        DoctorStudent doctorStudent=new DoctorStudent(998,"jake","mike","class",22,"computer","29102","tarim",
                "bloccjain technology","fdsjfsj vdiof", Arrays.asList("hacking in blockchain","orivacy enhancemnet in blocchauin"));
        System.out.println(doctorStudent);

    }
}
