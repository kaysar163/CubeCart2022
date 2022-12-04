package com.unitedcoder.javaexercises.demo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Html {
    public static void main(String[] args) {
        String html="<div><h1>This is test HTML</h1><p>This is a test paragraph for"+
        "our html page</p></div>";
        File f=new File("C:\\Mvn-folder\\test.html");
        try{
            BufferedWriter bw=new BufferedWriter(new FileWriter(f));
            bw.write(html);
            bw.close();

        } catch (IOException e) {
           e.printStackTrace();
        }
    }
}
