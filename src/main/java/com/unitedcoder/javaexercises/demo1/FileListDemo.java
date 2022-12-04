package com.unitedcoder.javaexercises.demo1;
import java.io.File;
public class FileListDemo {
    public static void main(String[] args) {
        File file=new File ("C:\\");
        String[] files=file.list();
            for(String string :files){
                System.out.println(string);
            }
        }
    }

