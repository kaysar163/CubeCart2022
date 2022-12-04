package com.unitedcoder.javaexercises.demo1;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;

public class writedatatoCSV {
    public static void main(String[] args) throws IOException {


    //instatiating the cswriter class
    CSVWriter witer=new CSVWriter(new FileWriter("target//sample1.csv"));
    //write data into csv file
        String set1[]={"name","country","id","dept"};
        String set2[]={"ram","usa","001","it"};
        String set3[]={"ramesh","india","001","operations"};
        String set4[]={"raju","country","id","dept"};
        String set5[]={"ravi","india","005","it"};

        witer.writeNext(set1);
        witer.writeNext(set2);
        witer.writeNext(set3);
        witer.writeNext(set4);
        witer.writeNext(set5);
        //flush date to create csv file date
        witer.flush();
        System.out.println("data entered");



}
}

