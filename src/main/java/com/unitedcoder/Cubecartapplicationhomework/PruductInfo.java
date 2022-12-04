package com.unitedcoder.Cubecartapplicationhomework;

public class PruductInfo {
    private   String productName;
    private   String  productCode;
    private   String productWeight;
    private   String productWidth;
    private   String StockLevel;

    public PruductInfo() {
    }

    public PruductInfo(String productName, String productCode, String productWeight, String productWidth, String stockLevel) {
        this.productName = productName;
        this.productCode = productCode;
        this.productWeight = productWeight;
        this.productWidth = productWidth;
        StockLevel = stockLevel;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(String productWeight) {
        this.productWeight = productWeight;
    }

    public String getProductWidth() {
        return productWidth;
    }

    public void setProductWidth(String productWidth) {
        this.productWidth = productWidth;
    }

    public String getStockLevel() {
        return StockLevel;
    }

    public void setStockLevel(String stockLevel) {
        StockLevel = stockLevel;
    }

    @Override
    public String toString() {
        return "PruductInfo{" +
                "productName='" + productName + '\'' +
                ", productCode='" + productCode + '\'' +
                ", productWeight='" + productWeight + '\'' +
                ", productWidth='" + productWidth + '\'' +
                ", StockLevel='" + StockLevel + '\'' +
                '}';
    }
}
