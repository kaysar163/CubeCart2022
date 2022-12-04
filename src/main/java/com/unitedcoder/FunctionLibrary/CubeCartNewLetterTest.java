package com.unitedcoder.FunctionLibrary;

import org.openqa.selenium.WebDriver;

public class CubeCartNewLetterTest {
    public static void main(String[] args) {


        WebDriver driver = null;
        FunctuionLibrary functuionLibrary=new FunctuionLibrary(driver);
        functuionLibrary.openBrowser("http://cubecartqa1.unitedcoderschool.com/admin_xrmx7f.php");
        functuionLibrary.logIn("testautomation1","automation123!");
        functuionLibrary.verifyLogin();
        functuionLibrary.addNewsLetter("about climate","richard","agt12@gmail.com","global warming");
        functuionLibrary.logout();
        functuionLibrary.closeBrowser();
    }
}

