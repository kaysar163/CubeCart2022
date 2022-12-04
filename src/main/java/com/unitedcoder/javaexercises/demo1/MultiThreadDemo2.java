package com.unitedcoder.javaexercises.demo1;

public class MultiThreadDemo2 extends Thread {
   public void run(){
       System.out.println("program is running  ");
   }

    public static void main(String[] args) {
        MultiThreadDemo2 thead1=new MultiThreadDemo2();
        MultiThreadDemo2 thread2=new MultiThreadDemo2();
        System.out.println("thread1 name "+thead1.getName());
        System.out.println("thread 2 name "+thread2.getName());
        System.out.println("thread 1 id: "+thead1.getId());
        System.out.println("thread 2 id:"+thread2.getId());
        thead1.start();
        thread2.start();
    }

}
