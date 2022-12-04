package com.unitedcoder.homework2;

import java.util.Arrays;

public class JavaArrayProroject {
    public static void main(String[] args) {

        /*Write a loop that fills an array  with 30 random numbers between 1 and 100;
        Count all the even numbers and print the total count;
        Count all the odd numbers and print the total count;
        Count all the numbers that are divided by three and print the total count;
        Calculate the sum and average of the 30 random numbers;
        Sort the number with ascending order and print out all the numbers;
        Sort the number with descending order and print out the number;
        */


        int[] arr = new int[30];

        int evenNumbers=0;
        int oddNumbers=0;
        int numDivideBy3=0;
        int sumOfRandomNumbers=0;
        double average=0;
        System.out.print("Random Numbers: ");
        for (int  i = 0; i <= arr.length-1; i++) {

            arr[i] = (int) (Math.random() * 100 + 1);
            System.out.print(arr[i]+" ");
            sumOfRandomNumbers+=arr[i];
            average=(double)sumOfRandomNumbers/30;
            if(arr[i]%2==0){
                evenNumbers++;
            }
            else if(arr[i]%2!=0){
                oddNumbers++;
            }
            else  if (arr[i]%3==0){
                numDivideBy3++;
            }

        }
        System.out.println();
        System.out.print("Total even Numbers:"+evenNumbers+"\n");
        System.out.print("Total odd Numbern:"+oddNumbers+"\n");
        System.out.print("numberDivideBy3: "+numDivideBy3+"\n");
        System.out.print("Sum of Random numbers:"+sumOfRandomNumbers+"\n");
        System.out.print("Average of Ramdom Numbers: "+average+ "\n");
        Arrays.sort(arr);
        System.out.print("Ascending Order:"+Arrays.toString(arr)+"\n");

        System.out.print("Descending order:");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
            }
}
}










