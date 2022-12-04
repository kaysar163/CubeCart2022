package com.unitedcoder.javabasic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class MultipleAmazonSerach {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        DateTime browserOpenedTime=new DateTime();
        driver.get("https://www.amazon.com/");

        List<String> products = new ArrayList<>();
        products.add("java book");
        products.add("java mat");
        products.add("yoga mat");
        products.add("hard disk");
        products.add("monitor");
        for (String valeu : products) {
            WebElement seachBox = driver.findElement(By.id("twotabsearchtextbox"));
            seachBox.clear();
            seachBox.sendKeys(valeu + Keys.ENTER);

           // driver.navigate().back();
        }
        driver.close();
        driver.quit();
        DateTime testEndTime=new DateTime();

        Period period=new Period(browserOpenedTime,testEndTime, PeriodType.seconds());
        System.out.println("total test time is ;"+period.getSeconds());
    }


    }

