package com.unitedcoder.homewrk3;

public class CustomerObject {
    public static void main(String[] args) {
        //tile,firstname,lastname,email,phone,calle,password,confirmPassword
        Customer customer=new Customer();
        customer.setTitle("VIPcustomer");
        customer.setFirstName("Jonne");
        customer.setLastName("karilson");
        customer.setEmail("Jonne@hotmail.com");
        customer.setPhone("08-145267");
        customer.setCallPhone("075-69852314");
        customer.setPassword("1134455");
        customer.setConfirmPassword("1134455");
        System.out.println(customer);
    }
}
