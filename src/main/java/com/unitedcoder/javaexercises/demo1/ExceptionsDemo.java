package com.unitedcoder.javaexercises.demo1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ExceptionsDemo {
    public static void main(String[] args) throws IOException {
        int a=10;
        int b=0;
        try {

            float c = a / b;
            System.out.println("division is" + String.valueOf(c));
        }
        catch (ArithmeticException e)
        {
            e.printStackTrace();

        }
        finally {
            System.out.println("you divde any number by 0");
            System.out.println("continue");
        }
       writeList("testfile2");
    }
    //this will return indexof boundsException
    public static void writeList(String filename) throws IOException {
        //get cuurent project path
        String filePath=System.getProperty("user.dir");
        String fileSeparator = File.separator;
        //create a new file with time stamp
        File file =new File(filePath+fileSeparator+filename);
        //the filewriter constructor throws ioexeption with must be caught

        PrintWriter out=new PrintWriter(new FileWriter(file+".txt"));
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        for (int i=0;i<10;i++){
            //the get method thrwo indexofBoundsException with mus
            try{

                out.println("value att ;"+i+"="+list.get(i));

        }catch (IndexOutOfBoundsException e){
                e.printStackTrace();
            }
            finally {
                System.out.println("continue");
            }
            }
        out.println();
    }

}
