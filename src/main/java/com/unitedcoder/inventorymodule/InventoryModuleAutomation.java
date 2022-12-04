package com.unitedcoder.inventorymodule;

import com.unitedcoder.configutility.ApplicationConfig;
import com.unitedcoder.configutility.ScreenShotUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class InventoryModuleAutomation {
    static WebDriver driver;

    public static void openBrowser() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
    }

    public static void ReadConfigFileLogin() {
        String configFileName = "config.properties";
        String url = ApplicationConfig.readFromConfigProperties(configFileName, "qaurl");
        String username = ApplicationConfig.readFromConfigProperties(configFileName, "userName");
        String password = ApplicationConfig.readFromConfigProperties(configFileName, "passwrod");
        String  timeout= ApplicationConfig.readFromConfigProperties(configFileName, "timeou");
        driver.get(url);
        driver.get(timeout);
        WebElement userNameField = driver.findElement(By.id("username"));
        userNameField.sendKeys(username);
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys(password);
        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();
    }
        public static void logOut() {
        WebElement logUotLink=driver.findElement(By.cssSelector(".fa.fa-sign-out"));
        ScreenShot screenShot=new  ScreenShot();
        screenShot.takeScreenShot("image","login",  driver);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        logUotLink.click();
                    driver.close();
                    driver.quit();
            }
}







