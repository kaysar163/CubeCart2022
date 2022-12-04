package com.unitedcoder.SingletonDesign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.unitedcoder.SingletonDesign.TestBase.driver;
import static com.unitedcoder.SingletonDesign.TestBase.waitForElementPresent;

public class DashboardPage extends  TestBase {
    public boolean verifyLogin(){
        WebElement logoutLink=driver.findElement(By.xpath("//*[contains(text(),\"Log Out \")]"));
        if(logoutLink.isDisplayed()){
            System.out.println("login Successfully!!!");
            return  true;
        }
        else {
            System.out.println("login Failed!");
            return false;
        }
    }
    public  void clickOnCategoriesLink(){
        WebElement categoryLink=driver.findElement(By.id("nav_categories"));
        waitForElementPresent(categoryLink,10);
        categoryLink.click();
    }
}

