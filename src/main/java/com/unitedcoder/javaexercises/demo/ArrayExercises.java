package com.unitedcoder.javaexercises.demo;

import java.util.HashSet;

public class ArrayExercises {
    public static void main(String[] args) {

        HashSet<Integer> set1=new HashSet<>();
        set1.add(20);
        set1.add(10);
        set1.add(200);
        set1.add(50);
        set1.add(23);
        set1.add(22);
        set1.add(27);
        set1.add(20);
        System.out.println(set1);
        System.out.println(set1.size());

        Object[] array=set1.toArray();
        for(int i=0;i< array.length;i++){
            System.out.println(array[i]+ " ");
        }
        }
    }


