package com.unitedcoder.configutility;

public class ConfigDemo {
    public static void main(String[] args) {
        String configFileName = "config.properties";
        ApplicationConfig.readFromConfigProperties(configFileName,"qaurl");
        ApplicationConfig.readFromConfigProperties(configFileName,"userName");
        ApplicationConfig.readFromConfigProperties(configFileName,"passwrod");
        ApplicationConfig.readFromConfigProperties(configFileName,"timeout");
    }
}


