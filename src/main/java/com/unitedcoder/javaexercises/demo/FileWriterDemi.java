package com.unitedcoder.javaexercises.demo;

import java.io.File;
import java.io.IOException;

public class FileWriterDemi {
    public static void main(String[] args) throws IOException{
        boolean b1;
        File f=new File("target\\kaysar.txt");
        b1=f.createNewFile();


    }
}
