package com.unitedcoder.configutility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.exec.environment.EnvironmentUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.Set;

public class LoginAutomation {
    public static void main(String[] args) {
        //set up chrome driver
        //define chromedriver location
        WebDriverManager.chromedriver().setup();
        //define chrome object isntnce
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        //read application config
        EnvoronmentUtility envoronmentUtility = new EnvoronmentUtility();
        String environmentName = System.getenv("environment").toUpperCase();
        String configFile = envoronmentUtility.getConfigFileByEnvironment(Environment.valueOf(environmentName));
        String url = ApplicationConfig.readFromConfigProperties(configFile, "url");
        String username = ApplicationConfig.readFromConfigProperties(configFile, "username");
        String password = ApplicationConfig.readFromConfigProperties(configFile, "password");
        //login

        driver.get(url);
        WebElement userNameField = driver.findElement(By.id("username"));
        userNameField.sendKeys(username);
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys(password);
        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();
        //verify login
        WebElement logoutLink = driver.findElement(By.xpath("//*[contains(text(),\"Log Out \")]"));
        ScreenShotUtility screenShotUtility=new ScreenShotUtility();
        if (logoutLink.isDisplayed()) {
            System.out.println("login successfully!");
            screenShotUtility.takeScreenShot("image","login",  driver);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        } else {
            System.out.println("login Failed!");

        }
        //logout and close the browser
        logoutLink.click();
        driver.quit();


    }}



