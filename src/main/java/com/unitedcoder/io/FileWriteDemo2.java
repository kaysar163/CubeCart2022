package com.unitedcoder.io;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.io.File;
import java.io.IOException;

public class FileWriteDemo2 {
    public static void main(String[] args) throws IOException {
        String s1 = "i am a united coder student";
        String s2 = "i am learning java  sdet to find a job";
        String finalContent = s1 + "\n" + s2;
        FileUtility fileUtility = new FileUtility();
        fileUtility.writeToFile("doc", "test-automation-" + getCurrentDateTime(), ".txt", finalContent);
    }
    public static  String getCurrentDateTime(){
        DateTime dateTime=new DateTime();
        DateTimeFormatter formatter= DateTimeFormat.forPattern("yyyy-MM-dd-HH-mm-ss-SS");

        return  dateTime.toString(formatter);

    }
}
