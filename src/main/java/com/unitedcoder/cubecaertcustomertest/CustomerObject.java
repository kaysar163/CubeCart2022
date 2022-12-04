package com.unitedcoder.cubecaertcustomertest;

import java.util.List;

public class CustomerObject {
    private String Title;
    private String FirstName;
    private String LastName;
    private  String Email;

    public CustomerObject() {
    }

    public CustomerObject(String title, String firstName, String lastName, String email) {
        Title = title;
        FirstName = firstName;
        LastName = lastName;
        Email = email;
    }

    public String getTitle() {
        return Title;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "CustomerObject{" +
                "Title='" + Title + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }



    }


