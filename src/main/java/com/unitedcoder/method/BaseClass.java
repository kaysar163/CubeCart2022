package com.unitedcoder.method;

import com.unitedcoder.homwork1.Customer1;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
    static WebDriver driver;
    public static void openBrowser(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
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
    public   static void addCustomer(CustomerInfo customerInfo){
        WebElement customerListLink=driver.findElement(By.linkText("Customer List"));
        customerListLink.click();
        WebElement addCustomerLink=driver.findElement(By.xpath("//a[contains(text(),'Add Customer')]"));
        addCustomerLink.click();
        WebElement titlleField=driver.findElement(By.id("cust-title"));
        titlleField.sendKeys( customerInfo.getTilte());
        WebElement firstNameField=driver.findElement(By.id("cust-firstname"));
        firstNameField.sendKeys( customerInfo.getFirstName());
        WebElement lastNameField=driver.findElement(By.id("cust-lastname"));
        lastNameField.sendKeys( customerInfo.getLastNmae());
        WebElement typeDropDown=driver.findElement(By.id("cust-type"));
        Select select=new Select(typeDropDown);
        select.selectByValue("1");
        WebElement emailField= driver.findElement(By.id("cust-email"));
        emailField.sendKeys( customerInfo.getEmail());
       // WebElement saveButton=driver.findElement(By.name("save"));
        WebElement typeDropDown1=driver.findElement(By.id("subscription_status"));
        Select select1=new Select(typeDropDown1);
        select1.selectByValue("1");
        WebElement saveButton=driver.findElement(By.name("save"));
        saveButton.click();
    }
    //verify customer added
    public  static boolean verifyCustomerAddedSuccessfully(){
        WebElement successMessage=driver.findElement(

                By.xpath("//*[contains(text(),'Customer successfully added.')]"));
        if(successMessage.isDisplayed()){
            System.out.println("Customer added successfully !");
            return true;
        }else{
            System.out.println("failed to add customer!");
            return  false;
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

    public static void sleep(int i) {
    }
}
