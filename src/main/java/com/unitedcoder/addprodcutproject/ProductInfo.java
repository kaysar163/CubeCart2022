package com.unitedcoder.addprodcutproject;

public class ProductInfo {
    private String productName;
    private  String productWeight;

    public ProductInfo() {
    }

    public ProductInfo(String productName, String productWeight) {
        this.productName = productName;
        this.productWeight = productWeight;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductWeight() {
        return productWeight;
    }

    @Override
    public String toString() {
        return "PruductInfo{" +
                "productName='" + productName + '\'' +
                ", productWeight='" + productWeight + '\'' +
                '}';
    }
}
