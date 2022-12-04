package com.unitedcoder.inventorymodule;

import org.checkerframework.checker.units.qual.A;

public class ConfigDemo {
    public static void main(String[] args) {
        String configFileName="config.properties";
        ApplicationConfig.ReadFromconfigProperties(configFileName,"qaurl");
        ApplicationConfig.ReadFromconfigProperties(configFileName,"userName");
        ApplicationConfig.ReadFromconfigProperties(configFileName,"passwrod");
        ApplicationConfig.ReadFromconfigProperties(configFileName,"timeout");
    }
}
