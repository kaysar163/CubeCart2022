package com.unitedcoder.javaexercises.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileWriteDemo1 {
    public static void main(String[] args) {
        writeToFile("target\\test.txt");

    }

    static void writeToFile(String FileToText) {
        String workingDir=System.getProperty("user.dir");
        String fileSeparatorSymbol= File.separator;//retur file seperator
        String filePath=workingDir+ fileSeparatorSymbol;
        System.out.println(filePath);
        try{
            RandomAccessFile file=new RandomAccessFile(filePath+fileSeparatorSymbol+FileToText,"rw");
            System.out.println(file.readLine());
            long point=file.getFilePointer();
            System.out.println(point);
            file.seek(file.length());
            file.write("this is another example of random file\n".getBytes());

        } catch (IOException e) {
           e.printStackTrace();
        }

    }
}
