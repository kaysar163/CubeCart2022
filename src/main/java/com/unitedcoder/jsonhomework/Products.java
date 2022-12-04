package com.unitedcoder.jsonhomework;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Products {
    @JsonProperty("status")
    private boolean status;
    @JsonProperty("productName")
    private String productName;
    @JsonProperty("manufacturer")
    private  String manufacturer;
    @JsonProperty("productCode")
    private String  productCode;
    @JsonProperty("productWeight")
    private double productWeight;
    @JsonProperty("ProductWidth")
    private  double ProductWidth;
    @JsonProperty(" productHeight")
    private  double productHeight;
    @JsonProperty("stockLevel")
    private  int stockLevel;
    @JsonProperty("stockLevelWarning")
    private  int  stockLevelWarning;
    @JsonProperty("active")
    private  boolean active;


    public Products() {
    }

    public Products(boolean status, String productName, String manufacturer, String productCode,
                    double productWeight, double ProductWidth, double productHeight,
                    int stockLevel, int stockLevelWarning, boolean active) {
        this.status = status;
        this.productName = productName;
        this.manufacturer = manufacturer;
        this.productCode = productCode;
        this.productWeight = productWeight;
        this.ProductWidth = ProductWidth;
        this.productHeight = productHeight;
        this.stockLevel = stockLevel;
        this.stockLevelWarning = stockLevelWarning;
        this.active = active;
    }

    @Override
    public String toString() {
        return "Products{" +
                "status=" + status +
                ", productName='" + productName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", productCode='" + productCode + '\'' +
                ", productWeight=" + productWeight +
                ", getProductWidth=" + ProductWidth +
                ", productHeight=" + productHeight +
                ", stockLevel=" + stockLevel +
                ", stockLevelWarning=" + stockLevelWarning +
                ", active=" + active +
                '}';
    }
}
