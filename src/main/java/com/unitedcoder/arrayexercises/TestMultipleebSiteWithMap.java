package com.unitedcoder.arrayexercises;

import com.google.common.base.Stopwatch;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMultipleebSiteWithMap {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        Map<String,String> websites=new HashMap<>();
        websites.put("google","https://www.google.com");
        websites.put("yahoo","https://www.yahoo.com");
        websites.put("youtube","https://www.youtube.com");
        websites.put("cnn","https://www.cnn.com");

        Set<String> keys=websites.keySet();
        for(String k:keys){
          //Stopwatch watch=new Stopwatch ();
           // Stopwatch watch=new stopwatch ();
          // watch.start();
            driver.get(websites.get(k));
            if(driver.getTitle().contains(k)){
                System.out.println(k+"opened uccessfully, test pass!!!");
               // watch.stop();
            }
            else {
                System.out.println(k+"not opened successfully, test fail!!!1");
            }
        }
        driver.close();
        driver.quit();

    }
}
