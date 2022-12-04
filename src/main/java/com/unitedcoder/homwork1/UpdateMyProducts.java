package com.unitedcoder.homwork1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpdateMyProducts {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://cubecartqa1.unitedcoderschool.com/admin_xrmx7f.php");
        driver.findElement(By.id("username")).sendKeys("testautomation1");
        driver.findElement(By.id("password")).sendKeys("automation123!" + Keys.ENTER);
        // click on Product link
        driver.findElement(By.id("nav_products")).click();
        Thread.sleep(3000);
        //click on view all link
        driver.findElement(By.xpath("//a[text()='View All']")).click();
        List<String> myProducts = new ArrayList<>();
        myProducts.addAll(Arrays.asList(" rice bowl", "Mirror", "chopping board"));
        List<String> updateValue = new ArrayList<>();
        updateValue.addAll(Arrays.asList("1kg", "500g", "3kg"));
        for (int i = 0; i < myProducts.size(); i++) {
            Thread.sleep(3000);
            //find my product location and click
           driver.findElement(By.xpath(String.format("//a[text()='%s']", myProducts.get(i)))).click();
           // driver.findElement(By.cssSelector(String.format(".fa.fa-pencil-square-o",myProducts.get(i)))).click();

            //edit the product name by adding updat evalue
            driver.findElement(By.id("name")).sendKeys(updateValue.get(i));
            //click on the save button
            driver.findElement(By.xpath("//input[@value='Save']")).click();
            //validation
            String SuccessfullMessage = driver.findElement(By.cssSelector(".success")).getText();
            if (driver.getPageSource().contains(SuccessfullMessage)) {
                System.out.println("UpdateMyProducts is successfully");
            } else
                System.out.println("Test is failed");
        }

            driver.close();
    driver.quit();


        }



    }

