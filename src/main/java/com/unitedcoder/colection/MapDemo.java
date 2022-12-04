package com.unitedcoder.colection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer>age=new LinkedHashMap<>();
        age.put("Axel",29);
        age.put("kaysar",89);
        age.put("jeck",59);
        System.out.println(age.get("kaysar"));
        age.replace("kaysar",18);
        System.out.println(age.get("kaysar"));
        //keyset
        Set<String> keys=age.keySet();
        System.out.println(keys);
        System.out.println(age);

        for(Map.Entry entry:age.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }

    }
}
