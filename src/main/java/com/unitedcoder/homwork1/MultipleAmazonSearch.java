package com.unitedcoder.homwork1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleAmazonSearch {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
       Products amazonProducts=new Products();
       amazonProducts.setProducts(new String[]{"Iphone Case","Monitir","Hard Disk"});
       int navigateCount=1;
       for(String value: amazonProducts.getProducts()){
           WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
           searchBox.sendKeys(value+ Keys.ENTER);
           if(navigateCount<amazonProducts.getProducts().length) {
               driver.navigate().back();
           }
           navigateCount++;

       }
       driver.close();
       driver.quit();


    }
}
