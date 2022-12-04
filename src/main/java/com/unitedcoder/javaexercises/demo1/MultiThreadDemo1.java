package com.unitedcoder.javaexercises.demo1;

public class MultiThreadDemo1 implements  Runnable{

    @Override
    public void run() {
        System.out.println("hello this is a thread");
        System.out.println("hello is a thread example ");
    }

    public static void main(String[] args) {
        MultiThreadDemo1 multiThreadDemo1=new MultiThreadDemo1();
        Thread thread=new Thread(multiThreadDemo1,"this is for Multithread");
        thread.start();
    }
}
