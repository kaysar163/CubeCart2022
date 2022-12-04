package com.unitedcoder.arrayexercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapdemo2 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();
        hm.put(100,"amit");
        hm.put(101,"vajay");
        hm.put(102,"ramul");
        System.out.println(hm);

        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        TreeMap<String,Integer>prices=new TreeMap<>();
        prices.put("iphone",1000);
        prices.put("sumsong",0000);
        prices.put("lg",400);
        for(Map.Entry m:prices.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());


    }
}
}
