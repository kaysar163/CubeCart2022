package com.unitedcoder.inventorymodule;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ApplicationConfig {
    public static  String ReadFromconfigProperties(String FileName,String key ){
        Properties properties=new Properties();
        String workingDirectory=System.getProperty("user.dir");
        String valeu;
        try {
            properties.load(new FileInputStream( workingDirectory+ File.separator+FileName));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        valeu=properties.getProperty(key);
        System.out.println(String.format("%s=%s",key,valeu));
        return valeu;
    }

}
