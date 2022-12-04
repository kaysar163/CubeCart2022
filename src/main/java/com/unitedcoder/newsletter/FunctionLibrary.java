package com.unitedcoder.newsletter;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FunctionLibrary {
     WebDriver driver;
    public void openBrowser (String url){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }
    public  void logIn(String userName,String passWord){
        WebElement  userNameField=driver.findElement(By.id("username"));
        userNameField.sendKeys(userName);
        WebElement passWordField=driver.findElement(By.id("password"));
        passWordField.sendKeys(passWord);
        WebElement loginbutton=driver.findElement(By.id("login"));
        loginbutton.click();
    }
    public boolean verifyLogin(){
        WebElement logoutLink=driver.findElement(By.xpath("//*[contains(text(),'Log Out ')]"));
        if(logoutLink.isDisplayed()){
            System.out.println("login Successfully!");
            return  true;

        }
        else {
            System.out.println("login Failed");
            return  false;
        }

        }

    public void  addNewsletter(String subject,String name,String email,String htmlContent) throws InterruptedException {
        WebElement newsletterLink=driver.findElement(By.linkText("Newsletters"));
        newsletterLink.click();
        WebElement addNewsLetterLink=driver.findElement(By.linkText("Create Newsletter"));
        addNewsLetterLink.click();
        WebElement subjectField=driver.findElement(By.id("email_subject"));
        subjectField.sendKeys(subject);
        WebElement senderNameField=driver.findElement(By.id("sender_name"));
        senderNameField.sendKeys(name);
        WebElement mailAdressField=driver.findElement(By.id("sender_email"));
        mailAdressField.sendKeys(email);
      //  WebElement htmlContentLink=driver.findElement(By.xpath("//div[@id=\"tab_email_html \"]/a"));
        Thread.sleep(3000);
        WebElement htmlContentLink=driver.findElement(By.xpath("/html/body/div[4]/div[3]/div[1]/div[2]/a"));
        htmlContentLink.click();
        Thread.sleep(3000);
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"cke_1_contents\"]/iframe")));
        Thread.sleep(3000);
        WebElement contenField=driver.findElement(By.xpath("/html/body/p"));
        Thread.sleep(3000);
        contenField.sendKeys(htmlContent);
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        WebElement saveButten=driver.findElement(By.xpath("//*[@id=\"page_content\"]/form/div[5]/input[3]"));
        saveButten.click();
    }
    public boolean verifyNewsLetterAddedSuccessfully(){
        String expectedMessage="Newsletter Saved.";
        String actualMessage=driver.findElement(By.xpath("//div[@id=\"gui_message\"]/div")).getText();
        if(expectedMessage.equals(actualMessage)){
            System.out.println("news letter added successfully");
            return true;
        }
        else {
            System.out.println("Failed to add newsletter!!1");
            return  false;
        }

    }
    public boolean logout(){
        WebElement logoutLink=driver.findElement(By.xpath("//*[contains(text(),'Log Out ')]"));
        logoutLink.click();
        WebElement loginButton=driver.findElement(By.id("login"));
        if(loginButton.isDisplayed())
            return true;
         else
               return false;
        }

    public  void closeBrowser(){
        driver.close();
        driver.quit();
    }

}
