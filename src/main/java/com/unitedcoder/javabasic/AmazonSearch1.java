package com.unitedcoder.javabasic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class AmazonSearch1 {
    public static void main(String[] args) throws InterruptedException {
        Map<String,String> webSites=new HashMap<>();
        webSites.put("google","https;//www.google.com");
        webSites.put("google","https;//www.google.com");
        webSites.put("google","https;//www.google.com");


        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);


        ChromeDriver driver=new ChromeDriver(options);
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();
        WebElement PASSENGERSButton= driver.findElement(By.id("divpaxinfo"));
        PASSENGERSButton.click();
        for(int i=0;i<=3;i++) {

            Thread.sleep(3000);
            WebElement ChildAddButton= driver.findElement(By.id("hrefIncChd"));

            ChildAddButton.click();

                }

        driver.close();
        }



    }







