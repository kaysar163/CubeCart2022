package com.unitedcoder.cubecaertcustomertest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.unitedcoder.cubecaertcustomertest.CustomerBaseClass.*;

public class CustomerTestRunner extends CustomerBaseClass {
    public static void main(String[] args) throws InterruptedException {
        openBrowser();
        logIn("testautomation1", "automation123!");

        CustomerObject customerObject1=new CustomerObject("Mr", "jonn", "mike", "kays99ghar163@7h9otmail.com");
        CustomerObject customerObject2=new CustomerObject("Mr","david","elon","kays9a8rhgh164@hot67mail.com");
        CustomerObject customerObject3=new CustomerObject("Mr","jonatan","mask","hg@7h7ot8mail.com");


        List<CustomerObject>  customerObjectList=new ArrayList<>();
        customerObjectList.add(customerObject1);
        customerObjectList.add(customerObject2);
        customerObjectList.add(customerObject3);


        AddMultipleCustomer(customerObjectList);
        customerObjectList.get(0).setTitle("mrs");
        customerObjectList.get(1).setTitle("mrs");
        customerObjectList.get(2).setTitle("mrs");


        UppdateAddMultipleCustomer(customerObjectList);

           // VerifyAddCustomerSuccessfully();
            logOut();



        }
    }




