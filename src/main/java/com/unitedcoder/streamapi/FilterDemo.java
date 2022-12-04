package com.unitedcoder.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.apache.commons.collections.CollectionUtils.collect;

public class FilterDemo {
    public static void main(String[] args) {

       List<Integer> list= Arrays.asList(10,11,13,15,40,30,5,90,60);
         /*for(int i:list){
            if(i%2==0)
                System.out.println(i);*/
        //list.stream().filter(s->s%2==0)
        list.stream().filter(s->s%2==0).forEach(s-> System.out.println(s));

        List<String> names=Arrays.asList("stockholm","paris","turpan","urumqi");
       // names.stream().filter(s -> s.length() > 4 && s.length() < 7.forEach(s -> System.out.println(s));
       // List<String>filterdName=new ArrayList<>();
       // filterdName=names.stream().filter(s-> s.length()>4&&s.length()<7.collect(Collectors.toList());
       // System.out.println(filterdName);
    }
}

