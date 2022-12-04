package com.unitedcoder.javaexercises.demo;

import org.apache.commons.io.output.FileWriterWithEncoding;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DemoWritingToFiles {
    public static void main(String[] args) throws IOException {
        //file class
        //fileWriter class
        //printer classbject
        File file=new File("target\\oyt1.txt");//created a file object called file
        FileWriter fw=new FileWriter(file,true);//created a filewriter o called pw
        PrintWriter pw=new PrintWriter(fw);//creater a printer object called pw

        pw.println("Line A");
        pw.println("Line B");
        pw.println("Line c");
        pw.close();
    }
}
