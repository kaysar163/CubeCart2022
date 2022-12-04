package com.unitedcoder.colection;

import java.util.Stack;

public class SatckDemo {
    public static void main(String[] args) {
        Stack<String> s1=new Stack<>();
        s1.push("book1");
        s1.push("book2");
        s1.push("book3");
        s1.push("book4");
       s1.pop();//lifos
        System.out.println(s1);
        s1.pop();
        s1.pop();
        s1.pop();
        System.out.println(s1.search("book2"));
        System.out.println(s1.search("book1"));
        System.out.println(s1.empty());
       // s1.peek();
        System.out.println(s1);
        System.out.println();
    }
}
