package com.unitedcoder.javaexercises.demo1;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("This is string builder example").append("\n");
        stringBuilder.append("line 1").append("\n");
        stringBuilder.append("line 2").append("\n");
        stringBuilder.append("line 3").append("\n");
        stringBuilder.append("line 4").append("\n");
        System.out.println(stringBuilder.toString());
        int[] myNumbers=new int[]{10,15,13,14,25,30,34,40};
        for(int i:myNumbers){
          stringBuilder.append(i).append("\n");
        }
        System.out.println(stringBuilder.toString());


    }

}
