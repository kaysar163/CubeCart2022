package com.unitedcoder.homwork1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddMultipleProducts {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://cubecartqa1.unitedcoderschool.com/admin_xrmx7f.php");
        driver.findElement(By.id("username")).sendKeys("testautomation1");
        driver.findElement(By.id("password")).sendKeys("automation123!" + Keys.ENTER);
        //clicked on products link
        driver.findElement(By.id("nav_products")).click();
        List<String> productName = new ArrayList<>();
        productName.addAll(Arrays.asList(" rice bowl", "Mirror", "chopping board"));
        List<String> productWeight = new ArrayList<>();
        productWeight.addAll(Arrays.asList("1kg", "500g", "3kg"));

        for (int i = 0; i < productName.size(); i++) {
            //click on add product link
           driver.findElement(By.xpath("//a[contains(text(),'Add Product')]")).click();
             //product Name field
           driver.findElement(By.id("name")).sendKeys(productName.get(i));

           //product weight field
            driver.findElement(By.id("product_weight")).sendKeys(productWeight.get(i));

            //click on the save butten
            driver.findElement(By.xpath(" //input[@value=\"Save\"]")).click();

            Thread.sleep(3000);
            //click select Icon
            driver.findElement(By.name("delete[]")).click();
            //click edid botten for update
            driver.findElement(By.cssSelector(".fa.fa-pencil-square-o")).click();

            //click again the save butten for Update
            driver.findElement(By.xpath("//input[@value=\"Save\"]")).click();

            //verify the  successfullyUpdate massage
             String successfulMessageUpdate = driver.findElement(By.cssSelector(".success")).getText();


            if (driver.getPageSource().contains(successfulMessageUpdate)) {
               System.out.println("Test is successfullyUpdate");

               // System.out.printf("%s added successfullyUpdate\n", productName.get(i));

            } else  {
        System.out.println("Test is failed");
                //System.out.printf("%s not added successfully", productName.get(i));

            }
        }

           driver.close();
           driver.quit();


    }
}























