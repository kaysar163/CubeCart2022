package com.unitedcoder.javaexercises.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class FaceBookSelecClassDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        //Thread.sleep(3000);
        driver.findElement(By.xpath("//*[text()=\"Allow essential and optional cookies\"]")).click();
        driver.findElement(By.xpath("//*[text()=\"Create New Account\"]")).click();
        Thread.sleep(3000);
       /* WebElement day = driver.findElement(By.id("day"));
        WebElement month = driver.findElement(By.id("month"));
        WebElement year = driver.findElement(By.id("year"));
        //06-11-2000
        Select selectDate = new Select(day);
        Select selectMonth = new Select(month);
        Select selectYear = new Select(year);


        // selectDate.selectByValue("11");
        // selectMonth.selectByIndex(5);
        // selectYear.selectByVisibleText("2000");
        /*selectValueFromDropDown(month, "5");
        selectValueFromDropDown(day, "10");
        selectValueFromDropDown(year, "1999");

        //List<WebElement> options = selectYear.getOptions();
       // for (int i = 0; i < options.size(); i++) {
           // System.out.println(options.get(i).getText());
        //}
        List<WebElement> months=driver.findElements(By.xpath("//*[@id=\"month\"]/option"));
        for(int i=0;i<months.size();i++){
            System.out.println(months.get(i).getText());
        }


    }


    public static void selectValueFromDropDown(WebElement webElement,String value){
        Select s1=new Select(webElement);
        s1.selectByValue(value);*/

    }
}


