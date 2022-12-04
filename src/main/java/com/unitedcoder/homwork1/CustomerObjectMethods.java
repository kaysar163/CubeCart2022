package com.unitedcoder.homwork1;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;

public class CustomerObjectMethods {
    //login add customer delate customer ddit customer
    WebDriver driver;

    public CustomerObjectMethods() {
    }

    public CustomerObjectMethods(WebDriver driver) {
        this.driver = driver;
    }


    public  void logIn(LoginUser user){
        WebElement userNameField=driver.findElement(By.id("username"));
        userNameField.sendKeys(user.getUserName());
        WebElement paswordFiled=driver.findElement(By.id("password"));
        paswordFiled.sendKeys(user.getPassword());
        WebElement loginButton=driver.findElement(By.id("login"));
        loginButton.click();
    }
    public void addCustomer(Customer1 customer1){
       WebElement customerListLink=driver.findElement(By.linkText("Customer List"));
       customerListLink.click();
       WebElement addCustomerLink=driver.findElement(By.xpath("//a[contains(text(),'Add Customer')]"));
       addCustomerLink.click();
       WebElement titlleField=driver.findElement(By.id("cust-title"));
       titlleField.sendKeys(customer1.getTilte());
       WebElement firstNameField=driver.findElement(By.id("cust-firstname"));
       firstNameField.sendKeys(customer1.getFirstName());
       WebElement lastNameField=driver.findElement(By.id("cust-lastname"));
       lastNameField.sendKeys(customer1.getLastNmae());
       WebElement typeDropDown=driver.findElement(By.id("cust-type"));
        Select select=new Select(typeDropDown);
        select.selectByValue("1");
        WebElement emailField= driver.findElement(By.id("cust-email"));
        emailField.sendKeys(customer1.getEmail());
        WebElement saveButton=driver.findElement(By.name("save"));
        WebElement typeDropDown1=driver.findElement(By.id("subscription_status"));
        Select select1=new Select(typeDropDown1);
        select1.selectByValue("1");
        saveButton.click();
    }
    //verify customer added
    public  boolean verifyCustomerAddedSuccessfully(){
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
    public void logOut(){
        WebElement logOutLink=driver.findElement(By.cssSelector(".fa.fa-sign-out"));

        logOutLink.click();
        driver.close();
        driver.quit();
    }
}

