package com.unitedcoder.colection;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MutipleWebSiteTest {
    public static void main(String[] args) {
        Map<String,String> webSites=new HashMap<>();
        webSites.put("Google","https://www.google.com/");
        webSites.put("YouTube","https://www.youtube.com/");
        webSites.put("Amazon","https://www.amazon.com/");

        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();

        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        ChromeDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();

        Set<String> keys=webSites.keySet();
        for(String k:keys){
            StopWatch watch=new StopWatch();
            watch.start();
            driver.get(webSites.get(k));
            if(driver.getTitle().contains(k)){
                System.out.println(k+"Opened Sucessfully, Test Pass");
                watch.stop();
                System.out.println(k+"opened within"+watch.getTime(TimeUnit.MILLISECONDS));

            }
        }
        driver.close();
        driver.quit();

    }
}
