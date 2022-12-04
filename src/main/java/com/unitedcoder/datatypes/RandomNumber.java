package com.unitedcoder.datatypes;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {

        /*Write a Java program that prints out the sum and average of five random numbers from 1 to 50.

        Note: you can use Java Math.random() or Random object.*/

        Random r=new Random();
        double sum = 0; // is double so to prevent int division later on
        int amount = 5;
        int upperBound = 50;

        for (int i = 0; i < amount; i++) {
            int next = r.nextInt(upperBound) + 1; // creates a random int in [1,50]
            System.out.println(next);

            sum += next; // accumulate sum of all random numbers

        }
        System.out.println("sum :"+sum);

        System.out.println("Your average is: " + (sum/amount));
    }
}


