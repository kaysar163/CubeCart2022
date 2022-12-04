package com.unitedcoder.polimorphysm;

public class SingletonClass {
    private static  SingletonClass singLetonCalss=null;
    public String str;
    //make constructor private
    private SingletonClass(){
        str="hello";
    }
    //stsic hetInstance lazy initiazotion
    public static SingletonClass getInstance() {
        if(singLetonCalss==null){
            singLetonCalss=new SingletonClass();
        }
        return singLetonCalss;
    }

    public static void main(String[] args) {
        SingletonClass x=SingletonClass.getInstance();
        SingletonClass y=SingletonClass.getInstance();
        SingletonClass z=SingletonClass.getInstance();
        x.str=(x.str).toLowerCase();
        System.out.println(x.str);
        System.out.println(y.str);
        System.out.println(z.str);
    }
}

