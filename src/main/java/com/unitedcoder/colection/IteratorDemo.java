package com.unitedcoder.colection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(60);
        list1.add(80);
        list1.add(90);
        list1.add(600);
        System.out.println(list1);


        HashSet<Integer> set2 = new HashSet<>();
        set2.add(100);
        set2.add(80);
        set2.add(300);
        set2.add(90);
        System.out.println(set2);
        LinkedList<Integer> list = new LinkedList<>();
        list.add(23);
        list.add(237);
        list.add(238);
        list.add(233);
        System.out.println(list);


        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
            System.out.println();
        //convert to object array
        Object[] array=set2.toArray();
        for(int i=0;i<array.length;i++) {
            System.out.print(array[i] + " ");
        }

            int sum=0;
            for(int s:set2){
                System.out.println(s+"");
                sum+=s;

            System.out.println("sum of the set value is :"+sum);



        }
        }
    }






