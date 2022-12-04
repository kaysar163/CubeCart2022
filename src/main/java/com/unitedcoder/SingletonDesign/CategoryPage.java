package com.unitedcoder.SingletonDesign;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;

import java.util.List;

public class CategoryPage extends TestBase {
String myCatigoryName;
    public void addCategory(){
        //WebElement ClickAddCatogoryLink=driver.findElement(By.linkText("Add Category"));
        WebElement ClickAddCatogoryLink=driver.findElement(By.xpath("//a[text()=\"Add Category\"]"));
        //a[text()="Add Category"]
        waitForElementPresent(ClickAddCatogoryLink,10);
        WebElement statusCheckBox=driver.findElement(By.xpath("//img[@rel=\"#status\"]"));
        waitForElementPresent(statusCheckBox,5);
        statusCheckBox.click();
        WebElement visibleCheckBox=driver.findElement(By.xpath("//img[@rel=\"#visible\"]"));
        waitForElementPresent(visibleCheckBox,5);
        visibleCheckBox.click();
        WebElement categoryNameField=driver.findElement(By.id("name"));
        waitForElementPresent(categoryNameField,5);
        myCatigoryName="cheese"+System.currentTimeMillis();
        categoryNameField.sendKeys("Chesse"+System.currentTimeMillis());
        WebElement saveButton=driver.findElement(By.id("cat_save"));
        saveButton.click();
    }

    public  boolean verifyCategrySaveSuccessfully(){
        WebElement SuccessMassage=driver.findElement(By.cssSelector("div.success"));
        waitForElementPresent(SuccessMassage,10);
        if(SuccessMassage.isDisplayed()){
            System.out.println("category saved successfully");
            return  true;
        }else
            System.out.println("category not saved");
            return false;

    }
    public void DeleteCatogory() {
        sleep(2);
       // List<WebElement> row = driver.findElement(By.xpath(("//div[@id=\"categories\"]/table/tbody/tr"));
        //int rowCount = row.size();
        //for (int i = 1; i < rowCount; i++) {
            WebElement categoryNameFiled = driver.findElement(By.id("name"));
            waitForElementPresent(categoryNameFiled, 5);
            String categoryName = categoryNameFiled.getText();
            if (categoryName.equalsIgnoreCase(myCatigoryName)) {
                WebElement clickDeleteIcon = driver.findElement(By.cssSelector("fa fa-trash"));
                clickDeleteIcon.click();

            }
        }
       //waitForAlertPresent();
        Alert alert=driver.switchTo().alert();
       // alert.accept();




    private void waitForAlertPresent() {
    }


    public  boolean verifyCategryDeleteSuccessfully(){
        WebElement DeleteSuccessMassage = driver.findElement(By.cssSelector("success"));
        waitForElementPresent( DeleteSuccessMassage,3);
        if( DeleteSuccessMassage.isDisplayed()){
            System.out.println( "DeleteSuccessMassage successfully");
            return  true;
        }else
            System.out.println("deleted faild");
        return false;

    }



}

