package com.unitedcoder.exceldemo;

import com.unitedcoder.SingletonDesign.LoginPage;
import com.unitedcoder.SingletonDesign.TestBase;
import com.unitedcoder.homwork1.LoginUser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RoleBasedSecurityTest extends TestBase {
    public static void main(String[] args) throws IOException {
        String fileName = "Test_Deta/Book1.xlsx";
        String sheetName = "Sheet1";
        BrowserSetUp();
        ExcelUtility excelUtility = new ExcelUtility();
        List<LoginUser> loginUsers = excelUtility.reaMultipleCellValue(fileName, sheetName, 1);
        List<String> testResult=new ArrayList<>();
        testResult.add("testCase,module,test data,status");
        for (LoginUser users : loginUsers) {
            WebElement userNameField = driver.findElement(By.id("username"));
            waitForElementPresent(userNameField, 5);
            String userName=users.getUserName();
            userNameField.sendKeys(userName);
            WebElement passwordField = driver.findElement(By.id("password"));
            waitForElementPresent(passwordField, 5);
            String password=users.getPassword();
            passwordField.sendKeys(password);
            WebElement loginButton = driver.findElement(By.id("login"));
            loginButton.click();
            WebElement productsLink = driver.findElement(By.id("nav_products"));
            waitForElementPresent(productsLink, 10);
            if (productsLink.isDisplayed()) {
                System.out.println("Login Test Passed");
                testResult.add("Admin login,login"+userName+password+",Passed");
            } else {
                System.out.println("Login Test Failed");
                testResult.add("Admin login,login"+userName+password+",Failed");
            }
            WebElement logoutLink=driver.findElement(By.xpath("//*[contains(text(),'Log Out')]"));
            waitForElementPresent(logoutLink,10);
            logoutLink.click();

        }
        //excelUtility.reaMultipleCellValue(fileName,"Test_Deta/student_Info.xlsx");
        excelUtility.reaMultipleCellValue(fileName,"CubeCartTtestResult",1);


    }

}


