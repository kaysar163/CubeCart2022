package com.unitedcoder.io;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class FileWriteDemo extends FileWriteDemo2  {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        builder.append("Apache commons Io test");
        builder.append("Test automation cubecart");
        File myFile = new File("doc" + File.separator
                + FileWriteDemo.getCurrentDateTime() + "TestReport" + ".txt");
        try {
            FileUtils.writeStringToFile(myFile, builder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}















