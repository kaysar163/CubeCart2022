package com.unitedcoder.cubecaertcustomertest;

import com.unitedcoder.homewrk3.Customer;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.Callable;


public class CustomerBaseClass {
    static WebDriver driver;
    public CustomerBaseClass() {
    }
    public static void openBrowser(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://cubecartqa1.unitedcoderschool.com/admin_xrmx7f.php?");
    }

    public static void logIn(String userName,String password){
        WebElement userNameField=driver.findElement(By.id("username"));
        userNameField.sendKeys(userName);
        WebElement passworField=driver.findElement(By.id("password"));
        passworField.sendKeys(password);
        WebElement loginButten=driver.findElement(By.id("login"));
        loginButten.click();
    }
    public static void AddMultipleCustomer(List<CustomerObject> customerObjectList) throws InterruptedException {
        Thread.sleep(3000);
        for (CustomerObject customerObject : customerObjectList) {
            WebElement customerLinkList = driver.findElement(By.linkText("Customer List"));
            customerLinkList.click();
            WebElement AddCustomerLink = driver.findElement(By.xpath("//a[contains(text(),'Add Customer')]"));
            AddCustomerLink.click();

            WebElement titleField = driver.findElement(By.id("cust-title"));
            titleField.sendKeys(customerObject.getTitle());

            WebElement FirsrNameField = driver.findElement(By.id("cust-firstname"));
            FirsrNameField.sendKeys(customerObject.getFirstName());

            WebElement LastNameField = driver.findElement(By.id("cust-lastname"));
            LastNameField.sendKeys(customerObject.getLastName());

            WebElement typeDropDwon = driver.findElement(By.id("cust-type"));
            Select select = new Select(typeDropDwon);
            select.selectByValue("1");

            WebElement EmailFiled = driver.findElement(By.id("cust-email"));
            EmailFiled.sendKeys(customerObject.getEmail());
            WebElement SaveBotton = driver.findElement(By.name("save"));
            WebElement typeDropDwin1 = driver.findElement(By.id("subscription_status"));
            Select select1 = new Select(typeDropDwin1);
            select1.selectByValue("1");
            SaveBotton.click();
            WebElement SuccessMassage=driver.findElement(By.xpath("//div[@class=\"success\"]"));
            if(SuccessMassage.isDisplayed()){
                System.out.println("customer add Successfully!!!");
            }
            else{

                System.out.println("Faild to add customer");
            }}}

             public static void UppdateAddMultipleCustomer(List<CustomerObject> customerObjectList) throws InterruptedException {
             Thread.sleep(3000);
             for (CustomerObject customerObject : customerObjectList) {
                 WebElement customerAddid = driver.findElement(By.xpath(String.format("//table/tbody/tr/td[text()='%s']/following::td[3]/a[2]", customerObject.getEmail())));
              //  WebElement customerAddid = driver.findElement(By.xpath(String.format("//table/tbody/tr/td[text()='%s']/preceding::td[1]/a", customerObject.getEmail())));
            customerAddid.click();
            WebElement title = driver.findElement(By.xpath("//input[@id=\"cust-title\"]"));
            title.clear();title.sendKeys(customerObject.getTitle());

            WebElement SaveBotton = driver.findElement(By.name("save"));
            SaveBotton.click();

            WebElement SuccessMassage=driver.findElement(By.xpath("//div[@class=\"success\"]"));
            if(SuccessMassage.isDisplayed()){
                System.out.println("customer UpDate Successfully!!!");

            }
            else{

                System.out.println("Faild to Updatecustomer");
            }
            WebElement customerLinkList = driver.findElement(By.linkText("Customer List"));
            customerLinkList.click();
         }

    }
    public static void logOut() {
        WebElement logUotLink=driver.findElement(By.cssSelector(".fa.fa-sign-out"));
        logUotLink.click();
        driver.close();
        driver.quit();
    }
    }






