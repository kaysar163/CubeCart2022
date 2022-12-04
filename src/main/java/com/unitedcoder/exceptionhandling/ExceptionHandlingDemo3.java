package com.unitedcoder.exceptionhandling;

public class ExceptionHandlingDemo3 {
    public static void main(String[] args) {
        try{
        int[] arr=new int[]{5,100,20};
        System.out.println(arr[4]);

    }
    catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
    }finally{
        System.out.println("hello");
}

    }
}


