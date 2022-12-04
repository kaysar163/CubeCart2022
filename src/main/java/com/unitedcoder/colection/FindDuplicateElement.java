package com.unitedcoder.colection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindDuplicateElement {
    public static void main(String[] args) {


    List<String>fruitLists=new ArrayList<>();
    fruitLists.add("banana");
    fruitLists.add("apple");
    fruitLists.add("pear");
    fruitLists.add("strawberry");
    fruitLists.add("apple");
    fruitLists.add("banana");
    fruitLists.add("orange");

    HashSet<String> set=new HashSet<>();
    for(int i=0;i<fruitLists.size();i++){
        String fruits=fruitLists.get(i);
        if(set.add(fruits)==false){
            System.out.println(fruits+"is duplicated");
        }
    }

    }
}
