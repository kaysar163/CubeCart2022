package com.unitedcoder.javabasic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CubeCartLoginTest3 {
    public static void main(String[] args) throws InterruptedException {


        String username="testautomation1";
        String password="automation123!";

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("http://cubecartqa1.unitedcoderschool.com/admin_xrmx7f.php/");
        driver.manage().window().maximize();
        WebElement userNameField = driver.findElement(By.id("username"));
        userNameField.sendKeys("testautomation1");
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("automation123!");
        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();
        Thread.sleep(3000);


        //click customer list
        driver.findElement(By.xpath("//*[@id=\"menu_Customers\"]/li[1]/a")).click();

        //click add customer
        driver.findElement(By.xpath("//*[@id=\"tab_control\"]/div[3]/a")).click();

        //fill checkbox
        driver.findElement(By.xpath("//*[@id=\"general\"]/fieldset[1]/div[1]/span/img")).click();
        Thread.sleep(3000);


        WebElement fristNameField = driver.findElement(By.id("cust-firstname"));
        fristNameField.sendKeys("Michael");
        Thread.sleep(3000);
        WebElement lastNameField = driver.findElement(By.id("cust-lastname"));
        lastNameField.sendKeys("Jackson");
        Thread.sleep(3000);
        //select textbox
        driver.findElement(By.xpath("//*[@id=\"cust-type\"]")).isSelected();
        Thread.sleep(3000);
        WebElement emailAdressField = driver.findElement(By.id("cust-email"));
        emailAdressField.sendKeys("abcd@test.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"page_content\"]/div[2]/form/div[5]/input[3]")).click();
        WebElement result = driver.findElement(By.xpath("//*[@id=\"gui_message\"]/div"));


        if (result.isDisplayed()) {
            System.out.println("Test passed!");
        } else
            System.out.println("Test failed!");
    }
}


