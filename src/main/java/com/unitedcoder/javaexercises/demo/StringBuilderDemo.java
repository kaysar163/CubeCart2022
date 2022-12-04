package com.unitedcoder.javaexercises.demo;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("this is string builder example").append("\n");
        stringBuilder.append("line1").append("\n");
        stringBuilder.append("line2").append("\n");
        stringBuilder.append("line3").append("\n");
        stringBuilder.append("line4").append("\n");
        stringBuilder.append("final line");
        System.out.println(stringBuilder.toString());

        int[] myNumber=new int[]{10,15,13,14,25,30,34,40};

        for(int i: myNumber) {
            stringBuilder.append(i).append("\n");
        }
        System.out.println(stringBuilder.toString());




    }
}
