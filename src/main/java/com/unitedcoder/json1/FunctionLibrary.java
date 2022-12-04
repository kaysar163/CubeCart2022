package com.unitedcoder.json1;

import com.unitedcoder.SingletonDesign.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.joda.time.LocalDate;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FunctionLibrary extends TestBase {

    public void login(LoginUser loginUser) {
        WebElement userNameField = driver.findElement(By.id("username"));
        waitForElementPresent(userNameField, 5);
        userNameField.sendKeys(loginUser.getName());
        WebElement passwordField = driver.findElement(By.id("password"));
        waitForElementPresent(passwordField, 5);
        passwordField.sendKeys(loginUser.getPassword());
        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();
        //wait for for the logout buutton to display
        WebElement logoutIcon = driver.findElement(By.cssSelector("i.fa.fa-sign-out"));
        waitForElementPresent(logoutIcon, 30);

    }

    public boolean  addProduct(Product product) {
        WebElement productLink = driver.findElement(By.linkText("Products"));
        waitForElementPresent(productLink, 5);
        productLink.click();
        WebElement addProductLink = driver.findElement(By.xpath("//*[text()=\"Add Product\"]"));
        addProductLink.click();
        WebElement CheckBox = driver.findElement(By.cssSelector(".checkbox.cbs"));
        CheckBox.click();
        //fill out the new product form
        WebElement productNameBox = driver.findElement(By.id("name"));
        waitForElementPresent(productNameBox, 5);
        productNameBox.sendKeys(product.getProductName());
        //select apple as the manufactor
        Select productFactorySelect = new Select(driver.findElement(By.id("manufacturer")));
        productFactorySelect.selectByVisibleText("Apple");

        WebElement productCodeInputBox = driver.findElement(By.id("product_code"));
        productCodeInputBox.sendKeys(product.getProductCode());
        //add catogories
        WebElement categoryTabElement = driver.findElement(By.id("tab_category"));
        waitForElementPresent(categoryTabElement, 5);
        categoryTabElement.click();
       // WebElement productCategory = driver.findElement(By.id(product.getProductCategory()));
        //WebElement productCategory = driver.findElement(By.id(product.getProductCategory("(//*[text()=\"Apple\"])[2]/preceding-sibling::td")));
        WebElement productCategory = driver.findElement(By.xpath(String.format("(//*[text()='%s'])[2]/preceding-sibling::td",product.getProductCategory())));
        productCategory.click();
        WebElement productSaveButton = driver.findElement(By.cssSelector("input[value='Save']"));
        productSaveButton.click();


        WebElement SuccessMassage = driver.findElement(By.xpath("//div[@class=\"success\"]"));
        waitForElementPresent(SuccessMassage, 5);
        System.out.println("product added Successfully!!!"+SuccessMassage.getText());
        if (SuccessMassage.isDisplayed()) {
            return true;

        }else {
            return false;


        }
    }

    public boolean addCustomer(Customer customer) {
        WebElement customerLinkList = driver.findElement(By.linkText("Customer List"));
        waitForElementPresent(customerLinkList, 3);
        customerLinkList.click();
        WebElement AddCustomerLink = driver.findElement(By.xpath("//a[contains(text(),'Add Customer')]"));
        //waitForElementPresent(customerLinkList, 3);
        AddCustomerLink.click();

        WebElement FirsrNameField = driver.findElement(By.id("cust-firstname"));
        FirsrNameField.sendKeys(customer.getFirstName()+getCurrentTimeStamp());

        WebElement LastNameField = driver.findElement(By.id("cust-lastname"));
        LastNameField.sendKeys(customer.getLastName()+getCurrentTimeStamp());

        WebElement EmailFiled = driver.findElement(By.id("cust-email"));
        EmailFiled.sendKeys(customer.getEmail()+getCurrentTimeStamp());

        WebElement SaveBotton = driver.findElement(By.name("save"));
        SaveBotton.click();
        WebElement SuccessMessage=driver.findElement(
                By.xpath("//*[contains(text(),\"Customer successfully added.\")]"));
        if(SuccessMessage.isDisplayed()){
            System.out.println("customer added successfully!");
            return true;
        }else {
            System.out.println("failed to added customer!");
            return false;

        }

    }
public static  String getCurrentTimeStamp(){
    LocalDateTime now=LocalDateTime.now();
    DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS");
    return  now.format(formatter);
}
    public static void logOut() {
        WebElement logUotLink=driver.findElement(By.cssSelector(".fa.fa-sign-out"));
        logUotLink.click();
        driver.close();
        driver.quit();
    }
}



























