package com.unitedcoder.configutility;

import java.io.*;
import java.util.Properties;

public class ConfigDemo2 {
    public static void main(String[] args) {
        String configFile = "config7.properties";
        Properties properties = new Properties();
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(configFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(properties.get("timeout"));
        properties.setProperty("timeout", "35");
        FileOutputStream outputStream;
        try {
            outputStream = new FileOutputStream(configFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            properties.store(outputStream, null);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}