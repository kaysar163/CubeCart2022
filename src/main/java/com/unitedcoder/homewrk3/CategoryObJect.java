package com.unitedcoder.homewrk3;

import org.checkerframework.checker.units.qual.C;

public class CategoryObJect {
    public static void main(String[] args) {


    Category category=new Category();
    category.setName("Iphone14Pro");
    category.setStatus("produce");
    category.setVisible("purchase");
    category.setParentCategory("Apple");
        System.out.println(category);


    }
}

