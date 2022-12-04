package com.unitedcoder.homework2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultipleMaharaLogin {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.mahara.org/");
        List<String> usernames=new ArrayList<>();
        usernames.addAll(Arrays.asList("admin","student","learner","staff","sitestaff"));

        for(String value:usernames){
            WebElement usernameField=driver.findElement(By.id("login_login_username"));
            usernameField.sendKeys(value);
            WebElement passwordField=driver.findElement(By.id("login_login_password"));
            passwordField.sendKeys("MaharaDemo");
            driver.findElement(By.id("login_submit")).click();//here is loginBotten
            driver.findElement(By.cssSelector(".icon.icon-chevron-down.collapsed")).click();//AccountMenu
            Thread.sleep(1000);
            driver.findElement(By.id("logoutbutton")).click();
            WebElement massage=driver.findElement(By.cssSelector(".alert.alert-success"));//massage (You have been logged out successfully)
           if(massage.isDisplayed()){
                System.out.println(String.format("%s user login logout test passed","value"));

            }else {
               System.out.println("Failed");
           }
        }
        driver.close();
        driver.quit();
    }
}



