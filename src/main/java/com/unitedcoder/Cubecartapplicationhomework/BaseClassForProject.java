package com.unitedcoder.Cubecartapplicationhomework;

import com.unitedcoder.configutility.ApplicationConfig;
import com.unitedcoder.cubecartinventorymodule.ApplicationConfig1;
import com.unitedcoder.exceldemo.ExcelUtility;
import com.unitedcoder.io.FileUtility;
import com.unitedcoder.io.FileWriteDemo;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BaseClassForProject   {
    public static WebDriver driver;
   // public static  String fileName="config.properties";
    public static String excelFileName="Test_Deta/Book1.xlsx";

    public static  void LoginFromConfig(){
       /* String userName= ApplicationConfig.readFromConfigProperties(fileName,"username");
        String passwrod= ApplicationConfig.readFromConfigProperties(fileName,"passwrod");
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver=new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        String url=ApplicationConfig.readFromConfigProperties(fileName,"qaurl")   ;
        driver.get(url);
        WebElement userNameField=driver.findElement(By.id("username"));
        userNameField.sendKeys(userName);
        WebElement passwordFiled=driver.findElement(By.id("passwrod"));
        passwordFiled.sendKeys(passwrod);
        driver.findElement(By.id("login")).click();*/
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver=new ChromeDriver(options);
        driver.manage().window().maximize();

        String configFileName = "config.properties";
        String url = ApplicationConfig1.ReadFromconfigProperties(configFileName, "qaurl");
        String userName = ApplicationConfig1.ReadFromconfigProperties(configFileName, "userName");
        String password = ApplicationConfig1.ReadFromconfigProperties(configFileName, "passwrod");
        driver.get(url);
        WebElement userNameField=driver.findElement(By.id("username"));
        userNameField.sendKeys(userName);
        WebElement passwordField= driver.findElement(By.id("password"));
        passwordField.sendKeys(password);
        WebElement login=driver.findElement(By.id("login"));
        login.click();

}
public static  void addMultipleProductForBulkPrice(){
    ExcelUtility excelUtility=new ExcelUtility();
        List<PruductInfo> productInfolist;
        PruductInfo p1=new PruductInfo();
        PruductInfo p2=new PruductInfo();
        PruductInfo p3=new PruductInfo();
        productInfolist =new ArrayList<>(Arrays.asList(p1,p2,p3));
        for(int i=1;i<=productInfolist.size();i++){
            //productInfolist.get(i-1).setProductName(excelFileName,"",i,0));
            productInfolist.get(i-1).setProductName(excelUtility.readFromExcelCell(excelFileName,
                    "MultipleProduct",i,0));
            productInfolist.get(i-1).setProductName(excelUtility.readFromExcelCell(excelFileName,
                    "MultipleProduct",i,1));
            productInfolist.get(i-1).setProductName(excelUtility.readFromExcelCell(excelFileName,
                    "MultipleProduct",i,2));
            productInfolist.get(i-1).setProductName(excelUtility.readFromExcelCell(excelFileName,
                    "MultipleProduct",i,3));
            productInfolist.get(i-1).setProductName(excelUtility.readFromExcelCell(excelFileName,
                    "MultipleProduct",i,4));
        }
        for(int i=1;i<=productInfolist.size();i++){
            WebElement productLink=driver.findElement(By.id("nav_products"));
            productLink.click();
            WebElement addProductLink=driver.findElement(By.xpath("//*[text()=\"Add Product\"]"));
            addProductLink.click();
            WebElement productName=driver.findElement(By.id("name"));
            productName.sendKeys(productInfolist.get(i-1).getProductName());

            WebElement BrandDropDown=driver.findElement(By.id("manufacturer"));
            Select selectMenu=new Select(BrandDropDown);
            selectMenu.selectByVisibleText("Apple");

            WebElement productCode=driver.findElement(By.id("product_code"));
            productCode.sendKeys(productInfolist.get(i-1).getProductCode());

            WebElement productWeight=driver.findElement(By.id("product_weight"));
            productWeight.sendKeys(productInfolist.get(i-1).getProductWeight());

            WebElement productWidth=driver.findElement(By.id("product_width"));
            productWidth.sendKeys(productInfolist.get(i-1).getProductWidth());

            WebElement productStockLevel=driver.findElement(By.id("stock_level"));
            productStockLevel.sendKeys(productInfolist.get(i-1).getStockLevel());

            WebElement saveButton=driver.findElement(By.xpath("//input[@value=\"Save\"]"));
            saveButton.click();
            WebElement successMessage=driver.findElement(By.xpath("//*[text()=\"Product successfully created.\"]"));
            String testResult="";

            if(successMessage.isDisplayed()){
                testResult="Product added successfully";

            }else {
                testResult="add product failed";

            }
            FileUtility fileUtility=new FileUtility();
            try {
                fileUtility.writeToFile("doc","add product result-"+ FileWriteDemo.getCurrentDateTime(),
                        ".txt",testResult);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
}



            public static  void ChangeBulkPrice(){
                ExcelUtility excelUtility=new ExcelUtility();
            for (int b=1; b<=3;b++){
            WebElement bulkPriceChangeLink=driver.findElement(By.xpath("//a[text()=\"Bulk Price Change\"]"));
            bulkPriceChangeLink.click();
            WebElement bulkPriceValue=driver.findElement(By.name("price[value]"));
            bulkPriceValue.sendKeys("500");
            WebElement priceFieldDropDown=driver.findElement(By.name("price[field]"));
            priceFieldDropDown.click();
            Select selectPriceDropDown=new Select(priceFieldDropDown);
            selectPriceDropDown.selectByVisibleText("Sale Price");

            driver.findElement(By.xpath(String.format("//td[contains(text(),'%s')]/preceding-sibling::td/div/input",
                    excelUtility.readFromExcelCell(excelFileName, "MultipleProduct",b,0)))).click();
            driver.findElement(By.xpath("//input[@value=\"Save\"]"));

            WebElement successfullMessageForBulk=driver.findElement(By.xpath("//*[text()=\"Prices have been updated accordingly.\"]"));

            String testResult="";
            if(successfullMessageForBulk.isDisplayed()) {
                testResult = "prices updated accordingly";
            }else {
                testResult="prices update failed";
            }
            FileUtility fileUtility=new FileUtility();
                try {
                    fileUtility.writeToFile("doc","price update resulr"+FileWriteDemo.getCurrentDateTime(),".txt",testResult);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }
            }
            public static  void logOut(){
        WebElement logoutLink=driver.findElement(By.cssSelector("fa fa-sign-out"));
        logoutLink.click();

                }
                public static  void  closeBrowser(){
        driver.close();
        driver.quit();


}
}
