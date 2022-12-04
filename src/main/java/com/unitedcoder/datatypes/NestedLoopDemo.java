package com.unitedcoder.datatypes;

public class NestedLoopDemo {
    public static void main(String[] args) {
        for(int row=1;row<=5;row++){
            for(int colum=5;colum>row;colum--){
                System.out.print("*");
        }
            System.out.println();
    }
        System.out.println("**************************************");
        for (int i = 1; i <= 5; i++) {

            for(int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
    }

