package com.unitedcoder.arrayexercises;



import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class ArrayDemo2 {
    public static void main(String[] args) {
        Map<String,Integer> population=new HashMap<>();
        population.put("german",82000000);
        population.put("japan",12000000);
        population.put("netherland",182000000);
        System.out.println(population.entrySet());
        for(Map.Entry entry:population.entrySet());

       // System.out.println(entry.getkey()+": "+entry.getValue());



    }
}

