package com.unitedcoder.cubecartinventorymodule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.unitedcoder.cubecartinventorymodule.BaseClass.login;
import static com.unitedcoder.cubecartinventorymodule.BaseClass.logout;
import static com.unitedcoder.method.BaseClass.closeBrowser;
import static com.unitedcoder.method.BaseClass.openBrowser;

public class AddProductTestRunner extends BaseClass {
    public static void main(String[] args) {
        openBrowser();
        login();
        AddProductObject addProductObject1 = new AddProductObject("Iphone14-" + System.currentTimeMillis(),
                "APPLE" + System.currentTimeMillis(), "750gr", "15cm", "5824",
                "upc5555", "1500", "2500", "1000", "sattar2",
                "iam2" + System.currentTimeMillis() + "@gmail.com", "nasrullah",
                "Loved it");
        AddProductObject addProductObject2 = new AddProductObject("Iphone13-" + System.currentTimeMillis(),
                "APPLE" + System.currentTimeMillis(), "750gr", "15cm", "855",
                "upc5555", "2500", "3500", "1000", "sattar1",
                "iam1" + System.currentTimeMillis() + "@gmail.com", "ahmet",
                "That's a good one");
        AddProductObject addProductObject3 = new AddProductObject("Iphone12-" + System.currentTimeMillis(),
                "APPLE" + System.currentTimeMillis(), "750gr", "15cm", "1500",
                "upc5555", "1500", "2500", "1000", "sattar",
                "iam" + System.currentTimeMillis() + "@gmail.com", "mehmet",
                "I have never seen a product like this before in my life, It is incredible");
        List<AddProductObject> addProductObject = new ArrayList<>();
        addProductObject.addAll(Arrays.asList(addProductObject1, addProductObject2, addProductObject3));
        AddProductAllInfoObject addProductAllInfoObject = new AddProductAllInfoObject();
        addProductAllInfoObject.addProducts(addProductObject);
        addProductAllInfoObject.bulkPriceChange(addProductObject);
        addProductAllInfoObject.addProductReview(addProductObject);
        addProductAllInfoObject.updateProductReview(addProductObject);
        addProductAllInfoObject.deleteProductReview(addProductObject);
       // addProductAllInfoObject.deleteProduct(addProductObject);
        logout();
        closeBrowser();
    }
}

