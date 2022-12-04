package com.unitedcoder.javaexercises.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleClickDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("divpaxinfo")).click();
        for(int i=0;i<4;i++){
            Thread.sleep(2000);
            driver.findElement(By.id("hrefIncAdt")).click();

            WebElement Search=driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_btn_FindFlights\"]"));
            if( Search.getText().equalsIgnoreCase(" Search")){
                System.out.println("login test passed");
            }
            else {
                System.out.println("login test failed");
            }

        driver.close();
        driver.quit();
    }
}
}
