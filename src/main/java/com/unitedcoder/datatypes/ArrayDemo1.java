package com.unitedcoder.datatypes;

import java.util.*;

public class ArrayDemo1 {
    public static void main(String[] args) {
        List<String> country = new ArrayList<>();
        country.add("australia");
        country.add("japan");
        country.add("canada");
        country.add("korea");
        country.add("china");
        country.add("canada");

        Set<String> set = new HashSet<>();
        for (int i = 0; i < country.size(); i++) {
            String countryName = country.get(i);
            if (set.add(countryName) == false) {
                System.out.println(countryName + "is duplicated");
            }
        }


    }
}


