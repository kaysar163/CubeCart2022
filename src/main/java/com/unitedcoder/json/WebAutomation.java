package com.unitedcoder.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WebAutomation {
    @JsonProperty("course title")
    private String courseTile;
    @JsonProperty("price")
    private int price;

    public WebAutomation() {
    }

    public WebAutomation(String courseTile, int price) {
        this.courseTile = courseTile;
        this.price = price;
    }

    public String getCourseTile() {
        return courseTile;
    }

    public void setCourseTile(String courseTile) {
        this.courseTile = courseTile;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
