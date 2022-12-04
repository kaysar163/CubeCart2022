package com.unitedcoder.io;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtility {
    //create a method to write a text file
    public void writeToFile(String fileFolder, String fileName, String extension, String content) throws IOException {
        //create o folder if folder doesnt exist
        String rooPath = System.getProperty("user.dir");
        String finalFolder = rooPath + File.separator + fileFolder;
        File file = new File(fileFolder);
        if (!file.exists()) {
            file.mkdir();
            System.out.println("Folder is created");
        }
        //final file namefi
        String finalFileName = finalFolder + File.separator + fileName + extension;
        File myFile = new File(finalFileName);
        FileWriter writer = new FileWriter(myFile.getAbsoluteFile());
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        bufferedWriter.write(content);
        bufferedWriter.close();
    }

}



