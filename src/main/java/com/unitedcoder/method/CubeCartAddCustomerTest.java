package com.unitedcoder.method;

import org.openqa.selenium.WebElement;

public class CubeCartAddCustomerTest extends BaseClass{
    public static void main(String[] args) {
        openBrowser();
        loginIn("testautomation1","automation123!");
        CustomerInfo customerInfo=new CustomerInfo("kays5ar","bak54ri","M6r","kaysar14363@hotmail.com");
        addCustomer(customerInfo);
        verifyCustomerAddedSuccessfully();
        logOut();
        closeBrowser();


        }
}
