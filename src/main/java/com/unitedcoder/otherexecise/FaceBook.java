package com.unitedcoder.otherexecise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Collections;
import java.util.List;

public class FaceBook {
    public static void main(String[] args) throws InterruptedException {
        //define chromedriver location
        WebDriverManager.chromedriver().setup();
        //define chromedriver object instacce
        WebDriver driver = new ChromeDriver();
        //open browser and navigate
        driver.manage().window().maximize();
        driver.navigate().to("https://www.facebook.com/");
        //click cooks

        WebElement cooks = driver.findElement(By.xpath("//*[text()=\"Allow essential and optional cookies\"]"));
        cooks.click();
        WebElement CreatNewAcount = driver.findElement(By.xpath("//*[text()=\"Create New Account\"]"));
        CreatNewAcount.click();



       /* WebElement Day = driver.findElement(By.id("day"));
        WebElement Month = driver.findElement(By.id("month"));
        WebElement Year = driver.findElement(By.id("year"));
        //06-11-2022
        Select selectDay = new Select(Day);
        Select selectMonth = new Select(Month);
        Select selectYear = new Select(Year);
        selectDay.selectByValue("6");
        selectMonth.selectByIndex(10);
        selectYear.selectByVisibleText("2022");
        System.out.println(selectMonth.isMultiple());
       /* selectValueFromDropDown(Day,"3");
        selectValueFromDropDown(Month,"10");
        selectValueFromDropDown(Year,"1999");*/
        Thread.sleep(3000);
        WebElement month=driver.findElement(By.id("day"));

        List<WebElement> option= driver.findElements(By.xpath("//*[@id=\"day\"]/option"));
        for (int i = 0; i < option.size(); i++) {

            System.out.println(option.get(i).getText());
            }
        }
    }








       /* List<WebElement> months= (List<WebElement>) driver.findElement(By.xpath("//*[@id=\" month\"]/option"));
        for(int i=0;i<months.size();i++){
            System.out.println(months.get(i).getText());

    }
   // public static  void selectValueFromDropDown(WebElement webElement,String value){
       // Select s1=new Select(webElement);
      //  s1.selectByValue(value);

    }*/


