package com.unitedcoder.arrayexercises;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {


    ArrayList<Integer>arrayList=new ArrayList<>();
        arrayList.add(200);
        arrayList.add(800);
        arrayList.add(60);
        arrayList.add(8);
        System.out.println(arrayList.size());
        System.out.println(arrayList);
       // System.out.println(arrayList.get(1));
       // arrayList.set(1,1000);
       // System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);
        Collections.reverse(arrayList);
        System.out.println(arrayList);

        int sum=0;
        for(int i=0;i<arrayList.size();i++){
            sum+=arrayList.get(i);
            System.out.println(arrayList.get(i)+" ");

        }
       // System.out.println();
        System.out.println(sum);


}
}
