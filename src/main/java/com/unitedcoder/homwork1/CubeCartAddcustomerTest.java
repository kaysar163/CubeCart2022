package com.unitedcoder.homwork1;

import io.github.bonigarcia.wdm.WebDriverManager;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CubeCartAddcustomerTest {
    public static void main(String[] args) throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
        CustomerObjectMethods objectMethods=new CustomerObjectMethods(driver);
            driver.manage().window().maximize();
            driver.get("http://cubecartqa1.unitedcoderschool.com/admin_xrmx7f.php");

            LoginUser loginUser=new LoginUser("testautomation1","automation123!");
            Customer1 customer1=new Customer1("casgfgon","rfgfghe","5gfr","hjut406gfg45@hotmail.com");

        objectMethods.logIn(loginUser);
        objectMethods.addCustomer(customer1);
        Thread.sleep(7000);
        objectMethods.verifyCustomerAddedSuccessfully();
        objectMethods.logOut();
    }
}
