package com.unitedcoder.cubecartinventorymodule;

import com.unitedcoder.configutility.ApplicationConfig;
import com.unitedcoder.inventorymodule.ScreenShot;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class BaseClass {
    public static WebDriver driver;
    public static void openBrowser(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver=new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    public static void login(){
        String configFileName = "config.properties";
        String url = ApplicationConfig1.ReadFromconfigProperties(configFileName, "qaurl");
        String userName = ApplicationConfig1.ReadFromconfigProperties(configFileName, "userName");
        String password = ApplicationConfig1.ReadFromconfigProperties(configFileName, "passwrod");
        driver.get(url);
        WebElement userNameField=driver.findElement(By.id("username"));
        userNameField.sendKeys(userName);
        WebElement passwordField= driver.findElement(By.id("password"));
        passwordField.sendKeys(password);
        WebElement login=driver.findElement(By.id("login"));
        login.click();
    }

    public static void sleep(int second){
        try {
            Thread.sleep(1000*second);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void logout(){
        WebElement logout=driver.findElement(By.cssSelector(".fa.fa-sign-out"));
        logout.click();
        WebElement logUotLink=driver.findElement(By.cssSelector(".fa.fa-sign-out"));
        ScreenShot1 screenShot1=new  ScreenShot1();
        screenShot1.takeScreenShot("image","login",  driver);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        logUotLink.click();

    }

    public static void closeBrowser(){
        driver.close();
        driver.quit();
    }

}


