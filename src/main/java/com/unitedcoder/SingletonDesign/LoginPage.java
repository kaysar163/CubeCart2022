package com.unitedcoder.SingletonDesign;

import com.unitedcoder.homwork1.LoginUser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.unitedcoder.SingletonDesign.TestBase.driver;

public class LoginPage extends TestBase {
    public  void logIn(LoginUser loginUser){
        WebElement userNameField=driver.findElement(By.id("username"));
        waitForElementPresent(userNameField,5);
        userNameField.sendKeys(loginUser.getUserName());
        WebElement passwordField=driver.findElement(By.id("password"));
        waitForElementPresent(passwordField,5);
        passwordField.sendKeys(loginUser.getPassword());
        WebElement loginButton=driver.findElement(By.id("login"));
        loginButton.click();

    }
public  void logIn(String userName,String Password){
        WebElement userNameField=driver.findElement(By.id("username"));
        waitForElementPresent(userNameField,5);
        userNameField.sendKeys(userName);
        WebElement passwordField=driver.findElement(By.id("password"));
       waitForElementPresent(userNameField,5);
        passwordField.sendKeys(Password);
        WebElement loginButton=driver.findElement(By.id("login"));
        loginButton.click();

}

    }

