package com.unitedcoder.javaexercises.demo;

import com.csvreader.CsvReader;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadCsvFileDemo {
    public static void main(String[] args)  {
        try{
            CsvReader testUsers=new CsvReader("target\\sample1.csv");
            testUsers.readHeaders();
            int numberOfHeaders=testUsers.getHeaderCount();
            System.out.println("number of columns in the header is :"+numberOfHeaders);
            for(int i=0; i<numberOfHeaders;i++) {
                System.out.println(testUsers.getHeader(i) + ",  ");

            System.out.println();
            while (testUsers.readRecord()) {
                String testUser=testUsers.get("testUser");
                String country=testUsers.get("password");
                String id=testUsers.get("role");
                System.out.println(testUser);

            }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
