package com.unitedcoder.addprodcutproject;

import java.util.ArrayList;
import java.util.List;

public class UpdateProductExtendsAddProduct extends AddProductTest {
    public UpdateProductExtendsAddProduct(ProductInfo updateProduct1) {
        super();
    }

    public static void main(String[] args) throws InterruptedException {
        openBrowser();
        loginIn("testautomation1","automation123!");
        ProductInfo productInfo =new ProductInfo("sumsong","300g");
        ProductInfo productInfo1 =new ProductInfo("mototola","400g");
        addProduct( productInfo);
        addProduct( productInfo1);
       ProductInfo updateProduct1=new ProductInfo("iphone","750g");
        ProductInfo updateProduct2=new ProductInfo("iphone14","770g");
        new UpdateProductExtendsAddProduct( updateProduct1);
        new UpdateProductExtendsAddProduct( updateProduct2);

    }
}
