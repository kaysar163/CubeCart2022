package com.unitedcoder.arrayexercises;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer>list1=new ArrayList<>();
        list1.add(60);
        list1.add(80);
        list1.add(90);
        list1.add(600);
        Iterator<Integer> iterator=list1.iterator();
        while (iterator.hasNext()){
           System.out.println(iterator.next());

           // for(int i=0;i<list1.size();i++){
                //if(iterator.hasNext()){
                   // System.out.println(iterator.next()+" ");
                }
        System.out.println("************************************");
        ArrayList<Integer>list2=new ArrayList<>();
        list2.addAll(list1);
        System.out.println(list2);
        Object[]array=list2.toArray();
        for(int i=0; i<array.length;i++){
            System.out.println(array[i]+" ");

       // ListIterator<Integer>it=list2.listIterator(3);
       // while (it.hasPrevious()){
           // System.out.println(it.previous());


            }

        }

    }

