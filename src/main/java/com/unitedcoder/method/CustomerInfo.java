package com.unitedcoder.method;

public class CustomerInfo {

  private String FirstName;
  private String LastName;
  private String Tilte;
  private String Email ;

    public CustomerInfo() {

    }

    public CustomerInfo(String firstName, String lastNmae, String email) {
        FirstName = firstName;
        LastName = lastNmae;
        Email = email;

    }


    public CustomerInfo(String firstName, String lastNmae, String tilte, String email) {
        FirstName = firstName;
        LastName = lastNmae;
        Tilte = tilte;
        Email = email;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastNmae() {
        return LastName;
    }

    public void setLastNmae(String lastNmae) {
        LastName = lastNmae;
    }

    public String getTilte() {
        return Tilte;
    }

    public void setTilte(String tilte) {
        Tilte = tilte;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "Customer1{" +
                "FirstName='" + FirstName + '\'' +
                ", LastNmae='" + LastName + '\'' +
                ", Tilte='" + Tilte + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }

            }











