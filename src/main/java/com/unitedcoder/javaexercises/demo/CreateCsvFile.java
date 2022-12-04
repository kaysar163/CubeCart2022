package com.unitedcoder.javaexercises.demo;

import java.io.FileWriter;
import java.io.IOException;

public class CreateCsvFile {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder();

        stringBuilder.append("Name").append(",").append("website").append(",")
                .append("country").append("\n");
        stringBuilder.append("kaysar").append(",").append("www.infybuzz.com").append(",")
                .append("turpan").append("\n");
        stringBuilder.append("anwar").append(",").append("www.infybuzz.com").append(",")
                .append("usa").append("\n");
        try(FileWriter writer=new FileWriter("C:\\Mvn-folder\\hello.csv")){
            writer.write(stringBuilder.toString());
            System.out.println("csv file created.....");


        } catch (IOException e) {

        }
    }
}
