package com.unitedcoder.arrayexercises;

public class CustomerInfo {
    private String firstNmae;
    private String lastName;
    private String title;
    private String Email;

    public CustomerInfo() {
    }

    public CustomerInfo(String firstNmae, String lastName, String title, String email) {
        this.firstNmae = firstNmae;
        this.lastName = lastName;
        this.title = title;
        Email = email;
    }

    public String getFirstNmae() {
        return firstNmae;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTitle() {
        return title;
    }

    public String getEmail() {
        return Email;
    }
}

