package com.unitedcoder.json1;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.unitedcoder.SingletonDesign.TestBase;
import org.checkerframework.checker.units.qual.C;

import java.io.File;
import java.io.IOException;

public class AutomationWithJson extends TestBase{
    public static void main(String[] args) {
        //map json data to object
        ObjectMapper objectMapper=new ObjectMapper();
        CubecartTestData cubecartTestData=new CubecartTestData();
        try {
            cubecartTestData=objectMapper.readValue(new File("Test_Deta\\cubecart_test.json"),CubecartTestData.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        BrowserSetUp();
        FunctionLibrary functionLibrary=new FunctionLibrary();
        functionLibrary.login(cubecartTestData.getLongUser());
        functionLibrary.addProduct(cubecartTestData.getProduct());
        functionLibrary.addCustomer(cubecartTestData.getCustomer());
        functionLibrary.logOut();
        closeBroser();
    }
}
