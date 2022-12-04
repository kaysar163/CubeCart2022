package com.unitedcoder.addprodcutproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ProductBaseClass {
    static WebDriver driver;
    public static void openBrowser(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.setHeadless(true);
        driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://cubecartqa1.unitedcoderschool.com/admin_xrmx7f.php?");
    }
    public  static void loginIn(String userName,String password){
        WebElement userNameFiled=driver.findElement(By.id("username"));
        userNameFiled.sendKeys(userName);
        WebElement paswordField= driver.findElement(By.id("password"));
        paswordField.sendKeys(password);
        WebElement loginButton=driver.findElement(By.id("login"));
        loginButton.click();
    }
    public static void addProduct( ProductInfo productInfo) throws InterruptedException {
        //clicked on products link
        driver.findElement(By.id("nav_products")).click();
       /* List<String> productName = new ArrayList<>();
        productName.addAll(Arrays.asList(" rice bowl", "Mirror", "chopping board"));
        List<String> productWeight = new ArrayList<>();
        productWeight.addAll(Arrays.asList("1kg", "500g", "3kg"));
        for (int i = 0; i < productName.size(); i++) {*/
            //click on add product link
            driver.findElement(By.xpath("//a[contains(text(),'Add Product')]")).click();
            //product Name field
            driver.findElement(By.id("name")).sendKeys(productInfo.getProductName());
            //product weight field

            driver.findElement(By.id("product_weight")).sendKeys(productInfo.getProductWeight());
        Thread.sleep(3000);
            //click on the save butten
            driver.findElement(By.xpath(" //input[@value=\"Save\"]")).click();
           // Thread.sleep(3000);

            //click select Icon
           // driver.findElement(By.name("delete[]")).click();
            //click edid botten for update
            //driver.findElement(By.cssSelector(".fa.fa-pencil-square-o")).click();

            //click again the save butten for Update
            //driver.findElement(By.xpath("//input[@value=\"Save\"]")).click();
        }

            public  static boolean verifyCustomerAddedSuccessfully() {
            WebElement ProductUpDateSuccessMessage = driver.findElement(By.cssSelector(".success"));
            if (ProductUpDateSuccessMessage .isDisplayed()) {
                System.out.println("Product added successfully !");
                return true;
            } else {
                System.out.println("failed to add Product!");
                return false;
            }
        }



    public  static void logOut(){
        WebElement logUotLink=driver.findElement(By.cssSelector(".fa.fa-sign-out"));
        logUotLink.click();
    }
    public  static void  closeBrowser(){
        driver.close();
        driver.quit();
    }
}

