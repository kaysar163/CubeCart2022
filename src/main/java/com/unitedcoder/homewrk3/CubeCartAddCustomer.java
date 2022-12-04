package com.unitedcoder.homewrk3;

import com.unitedcoder.arrayexercises.CustomerInfo;
import com.unitedcoder.colection.LoginUser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CubeCartAddCustomer {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://cubecartqa1.unitedcoderschool.com/admin_xrmx7f.php");
        driver.findElement(By.id("username")).sendKeys("testautomation1");
        driver.findElement(By.id("password")).sendKeys("automation123!" + Keys.ENTER);

        Customer customer=new  Customer("kaysar"+System.currentTimeMillis(),
               "bowdun"+System.currentTimeMillis(),"mr",
        "kaysa"+System.currentTimeMillis()+"@gmail.com");

        WebElement customerListLink=driver.findElement(By.linkText("Customer List"));
        customerListLink.click();
        WebElement addCustomerLink=driver.findElement(By.xpath("//a[contains(text(),\"Add Customer\")]"));
        addCustomerLink.click();

        WebElement titleField=driver.findElement(By.id("cust-title"));
        titleField.sendKeys(customer.getTitle());
        WebElement firstNameField=driver.findElement(By.name("customer[first_name]"));
        firstNameField.sendKeys(customer.getFirstName());
        WebElement lastNameField=driver.findElement(By.name("customer[last_name]"));
        lastNameField.sendKeys(customer.getLastName());
        Thread.sleep(3000);
        WebElement typeDropDown=driver.findElement(By.id("cust-type"));
        Select select=new Select(typeDropDown);
        select.selectByValue("2");
        Thread.sleep(2000);
        WebElement emailField=driver.findElement(By.name("customer[email]"));
        emailField.sendKeys(customer.getEmail());
        Thread.sleep(2000);
        WebElement saveButton=driver.findElement(By.name("save"));
        saveButton.click();
        Thread.sleep(2000);
        WebElement successMessage=driver.findElement(
                By.xpath("//*[contains(text(),'Customer successfully added.')]"));
        if(successMessage.isDisplayed()){
            System.out.println("Customer added Successfullu!");
        }else{
            System.out.println("Failed to add customer!!");
        }
       // WebElement logOutLink=driver.findElement(By.cssSelector(".fa.fa-sign-out"));
       // logOutLink.click();
       // driver.close();
       // driver.quit();






    }
}
