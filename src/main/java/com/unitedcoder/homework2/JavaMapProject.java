package com.unitedcoder.homework2;

import java.util.HashMap;
import java.util.Map;

public class JavaMapProject {
   /* Key 	Value
    MD 	Maryland
    VA 	Virginia
    NY 	New York
    Count the number of keys and print out the number
    Use for each loop, print out the key and value of each state. */


    public static void main(String[] args) {
        Map<String,String> state=new HashMap<>();
        state.put("MD","Maryland");
        state.put("VA","Virginia");
        state.put("NY","New York");
        //count the number of the keys and print out the number
        System.out.println(state.size());
        //use for each loop,print out the key and value of each state
        System.out.println(state);
        for(Map.Entry entry:state.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }


    }
}
