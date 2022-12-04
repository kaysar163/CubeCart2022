package com.unitedcoder.exceldemo;

import com.unitedcoder.SingletonDesign.LoginPage;
import com.unitedcoder.SingletonDesign.ProductsPage;
import com.unitedcoder.SingletonDesign.TestBase;
import com.unitedcoder.homwork1.LoginUser;

public class CucartAddMultipleProduct extends TestBase {
    public static void main(String[] args) {
        String fileName="Test_Deta/ProductInfo.xlsx";
        ExcelUtility excelUtility=new ExcelUtility();
        String userName=excelUtility.readFromExcelCell(fileName,"Sheet1",1,0);
        String Password=excelUtility.readFromExcelCell(fileName,"Sheet1",1,1);
        BrowserSetUp();
        LoginPage loginPage=new LoginPage();
        LoginUser  loginUser = new LoginUser("testautomation1", "automation123!");
        loginPage.logIn ( loginUser);
        ProductsPage productsPage=new ProductsPage();
        productsPage.addMultipleProduct(fileName,"Sheet1");
        closeBroser();
        }
    }





