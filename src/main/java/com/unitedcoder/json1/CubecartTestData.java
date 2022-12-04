package com.unitedcoder.json1;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CubecartTestData {
    @JsonProperty("loginuser")
    private LoginUser longUser;
    @JsonProperty("product")
    private Product product;

    @JsonProperty("customer")
    private Customer customer;

    public CubecartTestData() {
    }

    public CubecartTestData(LoginUser longUser, Product product, Customer customer) {
        this.longUser = longUser;
        this.product = product;
        this.customer = customer;
    }

    public LoginUser getLongUser() {
        return longUser;
    }

    public void setLongUser(LoginUser longUser) {
        this.longUser = longUser;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "CubecartTestData{" +
                "longUser=" + longUser +
                ", product=" + product +
                ", customer=" + customer +
                '}';
    }
}