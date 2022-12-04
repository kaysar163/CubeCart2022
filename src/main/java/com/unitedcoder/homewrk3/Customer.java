package com.unitedcoder.homewrk3;

public class Customer {

    private  String  title ;
    private String FirstName ;
    private String LastName ;
    private String Email ;
    private String Phone ;
    private String CallPhone ;
    private String Password;
    private String ConfirmPassword;

    public Customer() {
    }

    public Customer(String title, String firstName, String lastName, String email, String phone, String callPhone, String password, String confirmPassword) {
        this.title = title;
        this.FirstName = firstName;
        this. LastName = lastName;
        this. Email = email;
        this.Phone = phone;
        this.CallPhone = callPhone;
        this.Password = password;
        this.ConfirmPassword = confirmPassword;
    }

    public Customer(String firstName, String lastName,String title, String email) {
        this. FirstName = firstName;
        this. LastName = lastName;
        this.  Email = email;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        title = title;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {

        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {

        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getCallPhone() {
        return CallPhone;
    }

    public void setCallPhone(String callPhone) {
        CallPhone = callPhone;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getConfirmPassword() {
        return ConfirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        ConfirmPassword = confirmPassword;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Title='" + title + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Email='" + Email + '\'' +
                ", Phone=" + Phone +
                ", CallPhone=" + CallPhone +
                ", Password='" + Password + '\'' +
                ", ConfirmPassword='" + ConfirmPassword + '\'' +
                '}';
    }
}

