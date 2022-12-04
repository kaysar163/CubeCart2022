package com.unitedcoder.parallilTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParallelAmazonSearch implements  Runnable{
    private String product;

    public ParallelAmazonSearch(String product){
         this.product=product;
    }
    //Runs this operation.
    @Override
    public void run() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys(product+ Keys.ENTER);
    }

    public static void main(String[] args) {
        ParallelAmazonSearch amazonSearch1=new ParallelAmazonSearch("ipad");
        ParallelAmazonSearch amazonSearch2=new ParallelAmazonSearch("ipad case");
        ParallelAmazonSearch amazonSearch3=new ParallelAmazonSearch("ipad lol");

        Thread t1=new Thread(amazonSearch1);
        Thread t2=new Thread(amazonSearch2);
        Thread t3=new Thread(amazonSearch3);

        t1.start();
        t2.start();
        t3.start();


    }
}
