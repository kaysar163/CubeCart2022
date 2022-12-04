package com.unitedcoder.datetime;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class JavaDateTimeDemo {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date);//get current date
        SimpleDateFormat sd=new SimpleDateFormat("M-dd-yyyy");
        System.out.println(sd.format(date));
       SimpleDateFormat sd1=new SimpleDateFormat("MMMM-dd-yyyy hh:mm:ss");
        System.out.println(sd1.format(date));
        LocalDateTime dateTime=LocalDateTime.now();
        System.out.println(dateTime.getMonth());
        System.out.println(dateTime.minusDays(5));
        System.out.println(dateTime.plusDays(3));

    }
}
