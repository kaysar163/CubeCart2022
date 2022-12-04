package com.unitedcoder.arrayexercises;

import java.util.HashSet;

public class JavaQuizs {
    public static void main(String[] args) {

        HashSet<Integer> set1=new HashSet<>();
        set1.add(20);
        set1.add(10);
        set1.add(100);
        set1.add(50);
        set1.add(100);

        System.out.println(set1);
        System.out.println(set1.size());

        Object [] array=set1.toArray();
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]+" ");
        }


}
}

