package com.unitedcoder.io;

import org.apache.commons.io.FileUtils;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        //FileUtils.deleteQuietly(new File("test_result"+File.separator+"customerModuleTest.txt"));
        boolean isFileDeleted=FileUtils.deleteQuietly(new File("doc"+File.separator+"test-automation-2022-11-11-01-22-06-46.txt"));
        System.out.println("file deleted is:"+isFileDeleted);


    boolean isFolderDeleted=FileUtils.deleteQuietly(new File("test_result56"));
    System.out.println("file deleted is:"+isFileDeleted);


            }
            }
