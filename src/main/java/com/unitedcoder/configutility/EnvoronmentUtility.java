package com.unitedcoder.configutility;

public class EnvoronmentUtility {
    public  String getConfigFileByEnvironment(Environment environment){
        String configFile=null;
        switch (environment){
            case QA :
                configFile="config.properties";
                break;
            case PROD:
                configFile="config.prod1-properties";
                break;
            default:
                configFile="config.properties" ;
                break;
        }
        return  configFile;

    }
}
