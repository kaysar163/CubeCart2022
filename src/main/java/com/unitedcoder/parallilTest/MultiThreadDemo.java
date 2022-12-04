package com.unitedcoder.parallilTest;

import java.util.Date;

public class MultiThreadDemo implements Runnable {
    public static  String message;
    public MultiThreadDemo(String message) {

        this.message = message;
    }
        //Runs this operation.
        @Override
    public void run() {
        for(int i=0;i<2;i++){
            Date date=new Date();
            System.out.println(date+" "+message);
            try{
                Thread.sleep(2000);

            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }

    }
}
