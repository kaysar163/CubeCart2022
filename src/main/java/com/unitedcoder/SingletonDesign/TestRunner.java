package com.unitedcoder.SingletonDesign;

import com.unitedcoder.homwork1.LoginUser;
import org.checkerframework.checker.units.qual.C;

public class TestRunner extends TestBase {
    public static void main(String[] args) {
        BrowserSetUp();
        LoginPage loginPage = new LoginPage();
        LoginUser loginUser = new LoginUser("testautomation1", "automation123!");
        loginPage.logIn(loginUser);
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.verifyLogin();
        dashboardPage.clickOnCategoriesLink();
        CategoryPage categoryPage = new CategoryPage();
        categoryPage.addCategory();
        categoryPage.verifyCategrySaveSuccessfully();
        categoryPage.DeleteCatogory();
        categoryPage.verifyCategryDeleteSuccessfully();
        closeBroser();
    }
}
