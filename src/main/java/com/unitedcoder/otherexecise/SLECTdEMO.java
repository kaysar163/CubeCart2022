package com.unitedcoder.otherexecise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SLECTdEMO {
    public static void main(String[] args) throws InterruptedException {
        //define chromedriver location
        WebDriverManager.chromedriver().setup();
        //define chromedriver object instacce
        WebDriver driver = new ChromeDriver();
        //open browser and navigate
        driver.manage().window().maximize();
        driver.navigate().to("https://www.facebook.com/");
        //click cooks
        WebElement cooks = driver.findElement(By.xpath("//*[text()=\"Allow essential and optional cookies\"]"));
        cooks.click();
        WebElement CreatNewAcount = driver.findElement(By.xpath("//*[text()=\"Create New Account\"]"));
        CreatNewAcount.click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("kaysar");
      // driver.findElement(By.name("lastname")).sendKeys("bak");

            }
        }




