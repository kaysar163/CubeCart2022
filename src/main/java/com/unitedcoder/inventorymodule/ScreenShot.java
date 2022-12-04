package com.unitedcoder.inventorymodule;

import org.apache.commons.io.FileUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShot {
    public  void takeScreenShot(String folder, String fileName, WebDriver driver){
        DateTime date=new DateTime();
        DateTimeFormatter formatter= DateTimeFormat.forPattern("yyyy-MM-dd-mm-ss-SS");
        String timestamp=date.toString(formatter);
        fileName=fileName+"-"+timestamp;
        File imageFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(imageFile,new File(folder+File.separator+fileName+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
