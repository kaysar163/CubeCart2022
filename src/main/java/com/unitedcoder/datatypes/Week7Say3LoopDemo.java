package com.unitedcoder.datatypes;

import java.util.Scanner;

public class Week7Say3LoopDemo {
    public static void main(String[] args) {

        /* Write a Java program that asks the user to enter an integer from the console
           and then print out all prime numbers up to that integer. For example,
           when the user enters 30, the program should print out
           2,3,5,7,11,13,17,19,23,29
           Recall that a number is a prime number if it is not divisible by any number except 1 and itself. */

            Scanner scanner = new Scanner(System.in);
            int i =0;
            int num =0;
            //Empty String
            String  primeNumbers = "";
            System.out.println("Enter the value of n:");
            int n = scanner.nextInt();
            scanner.close();
            for (i = 1; i <= n; i++)
            {
                int counter=0;
                for(num =i; num>=1; num--)
                {
                    if(i%num==0)
                    {
                        counter = counter + 1;
                    }
                }
                if (counter ==2)
                {
                    //Appended the Prime number to the String
                    primeNumbers = primeNumbers + i + " ,";
                }
            }
            System.out.println("Prime numbers from 1 to n are:");
            System.out.println(primeNumbers);
        }
    }















