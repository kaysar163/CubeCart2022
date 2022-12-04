package com.unitedcoder.SingletonDesign;

import com.unitedcoder.configutility.ApplicationConfig;
import com.unitedcoder.exceldemo.ExcelUtility;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class ProductsPage extends  TestBase{
    int timeOut = Integer.parseInt(ApplicationConfig.readFromConfigProperties("config01.properties", "timeout"));

    public void addProduct(String productName, String productCode) {
        WebElement productsLink = driver.findElement(By.id("nav_products"));
        waitForElementPresent(productsLink, timeOut);
        productsLink.click();
        WebElement addProductLink = driver.findElement(By.linkText("Add Product"));
        waitForElementPresent(addProductLink, timeOut);
        addProductLink.click();
        WebElement productnameField = driver.findElement(By.id("name"));
        waitForElementPresent(productnameField, timeOut);
        productnameField.sendKeys(productName);
        WebElement productCodeField = driver.findElement(By.id("product_code"));
        waitForElementPresent(productnameField,timeOut);
        productCodeField.sendKeys(productCode);
        //WebElement saveButton=driver.findElement(By.id("//input[@value=\"Save\"]"));
        WebElement saveButton=driver.findElement(By.id("//input[@value=\"Save\"]"));

        //*[@id="page_content"]/form/div[10]/input[3]
        waitForElementPresent(productnameField,timeOut);
        saveButton.click();



    }
         public  void addMultipleProduct(String fileName,String sheetName){
             ExcelUtility excelUtility=new ExcelUtility();
             ProductsPage productsPage=new ProductsPage();
             XSSFWorkbook workbook= null;
             try {
                 workbook = new XSSFWorkbook(fileName);
             } catch (IOException e) {
                 throw new RuntimeException(e);
             }
             XSSFSheet sheet=workbook.getSheet(sheetName);
             int rowCount=sheet.getLastRowNum();
             int cellCount=sheet.getRow(1).getLastCellNum();
             for(int r=1;r<rowCount;r++){
                 String productName=null;
                 String productCode=null;
                 for(int c=0;c<cellCount;c++){
            if(c==0){
                productName=excelUtility.readFromExcelCell(fileName, sheetName,r,c);
            }
            else {
                productCode=excelUtility.readFromExcelCell(fileName,sheetName,r,c);
            }
        }

                 productsPage.addProduct( productName,productCode);

    }
}
}


