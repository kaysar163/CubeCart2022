package com.unitedcoder.newsletter;

public class CubeCartAddNewsLetterTest {
    public static void main(String[] args) throws InterruptedException {


    FunctionLibrary functionLibrary=new FunctionLibrary();
   // functionLibrary.openBrowser("http://cubecartqa1.unitedcoderschool.com/admin_xrmx7f.php?_g=customers&node=email&action=add#email_html");
    functionLibrary.openBrowser("http://cubecartqa1.unitedcoderschool.com/admin_xrmx7f.php");
    functionLibrary.logIn("testautomation1","automation123!");
    functionLibrary.verifyLogin();
    functionLibrary.addNewsletter("About climate","kaysar","kaysar153@hotmail.com","global warning");
    functionLibrary.logout();
    functionLibrary.closeBrowser();
}
}
