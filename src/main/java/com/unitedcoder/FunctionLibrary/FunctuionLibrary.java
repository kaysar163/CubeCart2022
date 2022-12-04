package com.unitedcoder.FunctionLibrary;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FunctuionLibrary {
    WebDriver driver;

    public FunctuionLibrary(WebDriver driver) {
        this.driver = driver;
    }

    public void openBrowser(String url) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://cubecartqa1.unitedcoderschool.com/admin_xrmx7f.php");
        driver.get(url);

    }

    public void logIn(String userName, String password) {
        WebElement userNameField = driver.findElement(By.id("username"));
        userNameField.sendKeys(userName);
        WebElement passwordFiled = driver.findElement(By.id("password"));
        passwordFiled.sendKeys(password);
        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();
    }

    public boolean verifyLogin() {
        WebElement logoutLink = driver.findElement(By.xpath("//*[caontains(text(),'Log out')]"));

        if (logoutLink.isDisplayed()) {
            System.out.println("Login Successfully!");
            return true;
        } else {
            System.out.println("Login Failed");
            return false;
        }
    }

    public void addNewsLetter(String subject, String name, String email, String htmlContent) {
        WebElement newsLetterLink = driver.findElement(By.linkText("Newsletters"));
        newsLetterLink.click();
        WebElement addNewsLetterLink = driver.findElement(By.linkText("Create Newsletter"));
        addNewsLetterLink.click();
        WebElement subjectField = driver.findElement(By.id("email_subject"));
        subjectField.sendKeys(subject);
        WebElement senderNameField = driver.findElement(By.id("sender_name"));
        senderNameField.sendKeys(name);
        WebElement mailAddressField = driver.findElement(By.id("sender_email"));
        mailAddressField.sendKeys(email);
        // WebElement htmlContentLink=driver.findElement(By.xpath("//div[@id= \"tab_email_html \"]/a"));
        WebElement htmlContentLink = driver.findElement(By.id("tab_email_html"));
        htmlContentLink.click();
        driver.switchTo().frame(0);
        WebElement contentField = driver.findElement(By.xpath("/html/body/p"));
        contentField.sendKeys(htmlContent);
        driver.switchTo().defaultContent();
        WebElement saveButton = driver.findElement(By.xpath("//input[@value=\"Save\"]"));
        saveButton.click();
    }

    public boolean verifyNewsLetterAddedSuccessfully() {
        String expectedMessage = "Newsletter Saved";
        String actualMessage = driver.findElement(By.xpath("//div[@did=\"gui_message\"]")).getText();

        if (expectedMessage.equals(actualMessage)) ;
        System.out.println("new letter aded asuucessfully");
        return true;
   // }
   // else

      //  System.out.println("failed to add newsletter");
       //  return false;
}

public  boolean logout(){
    WebElement logoutLink=driver.findElement(By.xpath("//*[cantains(text(),'Log out')]"));
    logoutLink.click();
    WebElement loginButton=driver.findElement(By.id("login"));
    if(loginButton.isDisplayed()) {
        return true;
    }else
            return false;
    }
    public  void closeBrowser(){
    driver.close();
    driver.quit();
    }
}

