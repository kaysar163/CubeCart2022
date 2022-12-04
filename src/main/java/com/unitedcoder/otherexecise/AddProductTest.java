package com.unitedcoder.otherexecise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.Callable;

public class AddProductTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://cubecartqa1.unitedcoderschool.com/admin_xrmx7f.php");
        LoginUser CubeCartUser=new LoginUser("testautomation1","automation123!");
        WebElement userNameField=driver.findElement(By.id("username"));
        userNameField.sendKeys(CubeCartUser.getUserName());
        WebElement passwordField=driver.findElement(By.id("password"));
        passwordField.sendKeys(CubeCartUser.getPassword());
        driver.findElement(By.id("login")).click();
        WebElement productsLink=driver.findElement(By.id("nav_products"));
        productsLink.click();
        WebElement addProductLink=driver.findElement(By.cssSelector("#tab_control > div:nth-child(2) > a"));
        addProductLink.click();
        ProductContent productContent=new ProductContent("JavaBook"+System.currentTimeMillis());
        driver.findElement(By.id("name")).sendKeys( productContent.getProductName());
        WebElement conditionDropDown=driver.findElement(By.id("condition"));
       // Select select=new Select(conditionDropDown);
       // select.selectByVisibleText(DropDownContent1.Refurbished.toString());
       // select.selectByIndex(1);
        // SelectClassDemo1.s
       // FaceBook.selectValueFromDropDown(conditionDropDown,"new");
        Thread.sleep(3000);
        WebElement selectBox=driver.findElement(By.cssSelector(".chosen-container.chosen-container-single"));
       selectBox.click();
        Thread.sleep(3000);
       WebElement Calss=driver.findElement(By.xpath("//*[@id=\"google_category_chosen\"]/a/span"));
       Calss.click();
        //*[@id="google_category_chosen"]/a/span
        driver.findElement(By.xpath("//input[@value=\"Save\"]")).click();
       String successfulMessage= driver.findElement(By.cssSelector("#gui_message > div.success")).getText();

        if(driver.getPageSource().contains(successfulMessage)){
            System.out.println("Product added successfully, test pass!!!!");
        }
            else
              System.out.println("test failed");
           // driver.close();
           // driver.quit();
}
}
