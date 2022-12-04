package com.unitedcoder.javaexercises.demo1;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;


public class Demo {
    public static void main(String[] args)  {
        try{
        File file=new File("fileName.txt");

        if(!file.exists()){
            file.createNewFile();

        }
        PrintWriter pw=new PrintWriter(file);
        pw.println("this is my file content");
        pw.println(100000);
        pw.close();
            System.out.println("Done");

    }catch (IOException e){
            //todo auto-genereted catch block
            e.printStackTrace();

        }
}
}
