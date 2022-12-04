package com.unitedcoder.arrayexercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        //define a map for websites
    //key--google value: google website
    Map<String,String> websites=new HashMap<>();
   websites.put("google", " https://www .google.com");
   websites.put("yahoo",  "https:/www.yahoo.com");
   websites.put("youtube", "https://www.youtube.com");
   websites.put("cnn",     "https://www.cnn.com");
   //read value from key
        //System.out.println(websites.get("cnn"));


        Set<String> keySet=websites.keySet();
        for(String s:keySet){
            System.out.println(websites.get(s));
        }
        System.out.println(websites.entrySet());

}
}
