package com.unitedcoder.colection;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MaharaLogin{
    public static  void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.mahara.org/");
        LoginUser user=new  LoginUser();
       user.setUserName("Admin");
       user.setPassword("MaharaDemo");
        WebElement userNameField=driver.findElement(By.cssSelector("input[id='login_login_username']"));
       // WebElement userNameField1=driver.findElement(By.id("login_login_username"));
        userNameField.sendKeys(user.getUserName());
        WebElement passWordField=driver.findElement(By.xpath("//*[@id=\"login_login_password\"]"));
        passWordField.sendKeys(user.getPassword());
        WebElement loginBtn=driver.findElement(By.id("login_submit"));
        loginBtn.click();
        driver.findElement(By.cssSelector(".icon.icon-chevron-down.collapsed")).click();//AccountMenu
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"logoutbutton\"]/span[2]")).click();//logoutBooten
        driver.close();
        driver.quit();



    }
}
