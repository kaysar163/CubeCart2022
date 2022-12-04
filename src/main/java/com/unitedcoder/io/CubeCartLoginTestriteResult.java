package com.unitedcoder.io;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;

public class CubeCartLoginTestriteResult {
    public static void main(String[] args) throws IOException {
        String username="testautomation1";
        String password="automation123!";
        WebDriverManager.chromedriver().setup();

        ChromeOptions options=new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        ChromeDriver driver=new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.get("http://cubecartqa1.unitedcoderschool.com/admin_xrmx7f.php");
        WebElement userNameField=driver.findElement(By.id("username"));
        userNameField.sendKeys(username);
        WebElement passwordFiled=driver.findElement(By.id("password"));
        passwordFiled.sendKeys(password);

        driver.findElement(By.id("login")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            WebElement logoutLink=driver.findElement(By.cssSelector("fa fa-sign-out"));
            WebElement dashBoard=driver.findElement(By.xpath("//*[@id=\"dashboard\"]/h3"));
            String testResult="";
            if (logoutLink.isDisplayed()){
                testResult="Login Test Passed";

            }
           if(dashBoard.getText().equalsIgnoreCase("dashbord")){
               System.out.println("Login Test Passed!!!");
               testResult=testResult+"\n"+"dashbord displayed";
           }
           else {
               System.out.println("login test bcs of Dashbord logo");
               testResult="login test failed";
           }
           FileUtility fileUtility=new FileUtility();
           fileUtility.writeToFile("doc","cubecart-test"+FileWriteDemo2.getCurrentDateTime()
                ,".txt",testResult);
                driver.quit();
        }
    }
}

