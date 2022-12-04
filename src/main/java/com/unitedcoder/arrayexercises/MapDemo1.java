package com.unitedcoder.arrayexercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {
    public static void main(String[] args) {


        //define a map for websode
        //key google value google webside

        Map<String, String> websites = new HashMap<>();
        websites.put("google", "https://www.google.com");
        websites.put("yahoo", "https://www.yahoo.com");
        websites.put("youtube", "https://www.youtube.com");
        websites.put("cnn", "https://www.cnn.com");
        System.out.println(websites);
        ///read value frome keyge
        System.out.println(websites.get("cnn"));
        //read all values one by one
         Set<String> keySet=websites.keySet();
          for(String s:keySet){
          System.out.println(websites.get(s));
          }


         System.out.println(websites.entrySet());


    }
}

