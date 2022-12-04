package com.unitedcoder.Cubecartapplicationhomework;

import java.io.IOException;

public class ChangeBulkPriceAddDeleteUpdateReview extends ProductReview{
    public static void main(String[] args) throws IOException, InterruptedException {
        LoginFromConfig();
        addMultipleProductForBulkPrice();
        ChangeBulkPrice();
        AddReview();
        UpdateReview();
        DeleteReview();
        logOut();
        closeBrowser();
    }
}
