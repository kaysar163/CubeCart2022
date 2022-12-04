package com.unitedcoder.arrayexercises;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazomWthArray {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        ChromeDriver driver=new ChromeDriver();
        driver.get("");
        driver.manage().window().maximize();
        String[] productNmae={"ipad","java oracle book","hard disk"};
        for(String keyWords:productNmae) {
            WebElement searchBox = driver.findElement(By.id(""));
            searchBox.sendKeys(keyWords + Keys.ENTER);
            driver.navigate().back();
        }
        driver.close();
        driver.quit();


        }


    }

