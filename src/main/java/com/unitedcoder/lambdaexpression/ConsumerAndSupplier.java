package com.unitedcoder.lambdaexpression;

import com.google.common.base.Suppliers;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerAndSupplier {
    public static void main(String[] args) {


    Consumer<String> c1 = s -> System.out.println(s + " " + " is fun");
    Consumer<String> c2 = s -> System.out.println(s + " is not difficult");
    Consumer<String> c3 = s -> System.out.println(s + " is interesting");
    c1.accept("java");
        c1.accept("java");
        c2.accept("java");
        c3.accept("java");
        c1.andThen(c2).andThen(c3).accept("java");
        Supplier<Date> d=()->new Date();
        System.out.println(d.get());
}
}

