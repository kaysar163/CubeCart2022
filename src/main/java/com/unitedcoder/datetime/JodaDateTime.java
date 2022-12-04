package com.unitedcoder.datetime;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.PeriodType;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class JodaDateTime {
    public static void main(String[] args) {
        //define o new joda date timeutc
        DateTime time=new DateTime();
        System.out.println(time);
        DateTimeFormatter formatter= DateTimeFormat.forPattern("yyy-MM-dd-HH-ss-SS");
        System.out.println(time.toString(formatter));

        DateTime universalTime=new DateTime(DateTimeZone.UTC);
        System.out.println("universal time"+universalTime);

        Set<String> timeZones= ZoneId.getAvailableZoneIds();
        for(String s:timeZones){
            System.out.println(s);
        }
        DateTimeZone urumqiTime=DateTimeZone.forID("Asia/Urumqi");
        DateTime time1=new DateTime(urumqiTime);

        System.out.println("urumqi time is :"+time);

        System.out.println(universalTime.dayOfWeek());
        System.out.println(universalTime.getMonthOfYear());
        System.out.println(universalTime.getYear());

        //get day name
        DateTime.Property dayName=universalTime.dayOfWeek();
        System.out.println(dayName.getAsShortText());
        //get difference
        DateTime beginDate=new DateTime("2022-01-10");
        DateTime endDate=new DateTime();
       //Period period= new Period (beginDate,endDate, PeriodType.days());

       // System.out.println(period.getDays());


    }
}
