package com.unitedcoder.javaexercises.demo1;

import java.io.*;

public class LineNumberReaderDemo {
    public static void main(String[] args)  throws IOException{
        readerToString(".idea\\hellowrold.txt");

    }
    public static void readerToString(String fileToReader) throws IOException {
        String workingDir=System.getProperty("user.dir");
        File file=new File(workingDir+File.separator+fileToReader);
        System.out.println(file);
        LineNumberReader reader=new LineNumberReader(new FileReader(file));
        BufferedReader br=new BufferedReader(new FileReader(file));
        String s="";
        try{
            while (reader.readLine()!=null){
                int lineNumber=reader.getLineNumber();
                s=br.readLine();
                System.out.println(lineNumber+":"+"content"+s);
        }

        }catch (IOException e){
            e.printStackTrace();
        }



    }
}
