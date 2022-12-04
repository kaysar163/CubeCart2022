package com.unitedcoder.javabasic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CubeCartLoginTest2 {
    public static void main(String[] args) throws InterruptedException {

        String username="testautomation1";
        String password="automation123!";
        WebDriverManager.chromedriver().setup();

        ChromeOptions options=new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);

        ChromeDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://cubecartqa1.unitedcoderschool.com/admin_xrmx7f.php/");

        WebElement userNameField=driver.findElement(By.id("username"));
        userNameField.sendKeys(username);
        WebElement passwordField=driver.findElement(By.id("password"));
        passwordField.sendKeys(password) ;
        WebElement loginButton=driver.findElement(By.id("login"));
        loginButton.click();
        Thread.sleep(3000);
          ///coustomer list
        driver.findElement(By.xpath("//*[@id=\"menu_Customers\"]/li[1]/a")).click();
        Thread.sleep(3000);


          //add customer
        driver.findElement(By.xpath("//*[@id=\"tab_control\"]/div[3]/a")).click();
        Thread.sleep(3000);

        //Status
        driver.findElement(By.xpath("//*[@id=\"general\"]/fieldset[1]/div[1]/span/img")).click();
        Thread.sleep(3000);
        String fristName="Michael";
        String lastName="Jackson";
        WebElement fristNameField=driver.findElement(By.id("cust-firstname"));
        fristNameField.sendKeys(fristName);
        WebElement lastNameField=driver.findElement(By.id("cust-lastname"));
        lastNameField.sendKeys(lastName);
            //type(Resgistered customer)
        //driver.findElement(By.xpath("/html/body/div[4]/div[3]/div[2]/div/div[2]/form/div[1]/fieldset[1]/div[5]/span/select")).isSelected();
        driver.findElement(By.id("cust-type"));

        Thread.sleep(3000);
        String emailAdress="abcd@gmail.com";
        WebElement emailAdressField= driver.findElement(By.id("cust-email"));
        emailAdressField.sendKeys(emailAdress);

        ///seve
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/div[2]/div/div[2]/form/div[5]/input[3]")).click();


    }
    // driver.close();
    //driver.quit();
}
