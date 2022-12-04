package com.unitedcoder.configutility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CubeCartTestWithConfigFile {
    public static void main(String[] args) {
        String fileName="config7.properties";
        String username=ApplicationConfig.readFromConfigProperties(fileName,"userName");
        String password=ApplicationConfig.readFromConfigProperties(fileName,"passwrod");
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        ChromeDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        String url;
        if(Integer.parseInt(ApplicationConfig.readFromConfigProperties(fileName,"qa"))==0){
            url=ApplicationConfig.readFromConfigProperties(fileName,"qaurl");
        }else {
            url=ApplicationConfig.readFromConfigProperties(fileName,"prod-url");
            username=ApplicationConfig.readFromConfigProperties(fileName,"prodUserName");
        }
        driver.get(url);
        WebElement userNameField=driver.findElement(By.id("username"));
        userNameField.sendKeys(username);
        WebElement passwordFiled=driver.findElement(By.id("password"));
        passwordFiled.sendKeys(password);
        driver.findElement(By.id("login")).click();

        driver.close();
    }

}
