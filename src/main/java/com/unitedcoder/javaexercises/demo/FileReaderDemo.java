package com.unitedcoder.javaexercises.demo;

import java.io.*;

public class FileReaderDemo {
    public static void main(String[] args) {

        System.out.println(readToString(".idea\\helloworld.txt"));
    }
    public static String readToString(String fileToText){
        String workingDir=System.getProperty("user.dir");
        StringBuilder fileContent=new StringBuilder();
        File file=new File(workingDir+File.separator);
        System.out.println(file);
        try{


            FileReader fr=new FileReader(file+File.separator+fileToText);
            BufferedReader br=new BufferedReader(fr);
            String sCurrentLine;
            while ((sCurrentLine= br.readLine())!=null){
                fileContent.append(sCurrentLine).append("\n");

            }

        } catch (IOException e) {
            System.out.println("cannot read the text file");

        }
        return file.toString();
    }
}
