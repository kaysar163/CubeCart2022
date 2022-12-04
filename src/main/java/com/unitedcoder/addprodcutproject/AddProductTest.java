package com.unitedcoder.addprodcutproject;

import org.apache.poi.util.LittleEndianOutputStream;

import java.util.ArrayList;
import java.util.List;

import static com.unitedcoder.addprodcutproject.ProductBaseClass.*;

public class AddProductTest extends ProductBaseClass{
    public static void main(String[] args) throws InterruptedException {
        openBrowser();
        loginIn("testautomation1","automation123!");
        ProductInfo productInfo =new ProductInfo("gold","300g");
        ProductInfo productInfo1 =new ProductInfo("Silver","400g");
       List<ProductInfo> productInfoList=new ArrayList<>();
       productInfoList.add(productInfo1);
       productInfoList.add(productInfo);


        addProduct( productInfo);
        addProduct( productInfo1);
        verifyCustomerAddedSuccessfully();

       logOut();
       closeBrowser();
    }
}
