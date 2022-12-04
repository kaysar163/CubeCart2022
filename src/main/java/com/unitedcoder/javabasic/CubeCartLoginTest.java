package com.unitedcoder.javabasic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CubeCartLoginTest {
    public static void main(String[] args) throws InterruptedException {

        String username="testautomation1";
        String password="automation123!";
        WebDriverManager.chromedriver().setup();

        ChromeOptions options=new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://cubecartqa1.unitedcoderschool.com/admin_xrmx7f.php");
        WebElement userNameField=driver.findElement(By.id("username"));
        userNameField.sendKeys(username);

        WebElement paswordField=driver.findElement(By.id("password"));
        paswordField.sendKeys(password);

        WebElement loginButton=driver.findElement(By.id("login"));
        loginButton.click();
        Thread.sleep(3000);
        //Thread.sleep(3000);
        //WebElement logoutLink=driver.findElement(By.id("login"));
        //loginButton.click();
       // Thread.sleep(3000);
        WebElement LogoutLink=driver.findElement(By.cssSelector("i.fa-sign-out"));
        WebElement dashBoard=driver.findElement(By.xpath("/html/body/div[4]/div[3]/div[2]/div[2]/div[2]/h3"));

        if(dashBoard.getText().equalsIgnoreCase("dashboard")){
            System.out.println("login test passes!!");
        }
        else {
            System.out.println("login test failed");
        }
        driver.close();



    }

}
