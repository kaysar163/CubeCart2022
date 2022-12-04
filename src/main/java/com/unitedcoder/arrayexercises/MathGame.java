package com.unitedcoder.arrayexercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MathGame {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("how many question whould ypu like to do?");
        int n=scanner.nextInt();
        System.out.println(String.format("you will work on %d questions",n));
        System.out.println("lets start gale!!!");
        List<String> questions=new ArrayList<>();
        questions.add("x=d% y=%d what is x+y ");
        questions.add("x=d% y=%d what is x-y ");
        questions.add("x=d% y=%d what is x*y ");

        int point=0;
        for(int i=0;i<n;i++){
            int x=(int)(Math.random()*10+1);
            int y=(int)(Math.random()*10+1);
            String question=String.format("x=%d y=%d what is x+y",x,y);
            double rightAnswer=x+y;
            System.out.println("type your answer");
            Scanner input=new Scanner(System.in);
            int number=input.nextInt();
            if(number==rightAnswer){

                point++;
                
            }
        }

    }
}
