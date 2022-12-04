package com.unitedcoder.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo1 {
    public static void main(String[] args) {
        List<Integer> list1= Arrays.asList(100,90,10,20,5,40,50);
        list1.stream().filter(s->s%2==0).forEach(s-> System.out.println(s));
        List<String>customerList=Arrays.asList("tom","David","arzuggl","abdiila");
        customerList.stream().
                       filter(a->a.length()>3&&a.length()<8).forEach(System.out::println);
        System.out.println(customerList);
    }
}
