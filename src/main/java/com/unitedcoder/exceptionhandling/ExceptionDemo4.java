package com.unitedcoder.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
//import java.io.PrintWriter;

public class ExceptionDemo4 {
    public static void main(String[] args) {
        if(args.length>=1){
            int a=Integer.parseInt(args[0]);
            int b=Integer.parseInt(args[1]);//0
            try {
                float f = a / b;
            }catch (Exception e){
                File file=new File("exceptionMessage"+".txt");
                PrintWriter writer=null;
                try {
                   writer = new PrintWriter(file);
                }catch (FileNotFoundException ex){
                    ex.printStackTrace();
                }
                writer.println("denominator cant be  zero"+e.getMessage());
                writer.close();
            }
        }
        else
            System.out.println("you did not input");
    }
}


