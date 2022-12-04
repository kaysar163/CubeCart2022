package com.unitedcoder.datatypes;

public class Week7Say3LoopDemoprojectTwo {
    public static void main(String[] args) {

      int NumberCount=0;
      for(int i =1;i<500;i++){
          if(i%3==0||i%5==0||i%15==0){
              NumberCount++;
          }

      }

        System.out.println("how maney numbers devid by 3 5 15  ="+NumberCount);
        /*Write a Java program that prints out how many numbers
        between 1 and 500 divisible by 3,or 5, or 15 with zero remainder.  In addition,*/
        System.out.println("\nDivided by 3: ");
        for (int i=1; i<500; i++) {
            if (i%3==0)
                System.out.print(i +", ");
        }

        System.out.println("\n\nDivided by 5: ");
        for (int i=1; i<500; i++) {
            if (i%5==0) System.out.print(i +", ");
        }

        System.out.println("\n\nDivided by 15: ");
        for (int i=1; i<500; i++) {
            if (i%15==0)
                System.out.print(i +", ");
        }
        System.out.println("\n");
    }
}


