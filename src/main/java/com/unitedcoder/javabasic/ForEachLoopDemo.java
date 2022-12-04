package com.unitedcoder.javabasic;

public class ForEachLoopDemo {
    public static void main(String[] args) {
        //difine argumnet args[0]=100
        int i1=Integer.parseInt( args[0]);
        int i2=Integer.parseInt( args[1]);
        int i3=Integer.parseInt( args[2]);
        System.out.printf("%d+%d+%d=%d",i1,i2,i3,i1+i2+i3);



        //argument 4 value
        int sum=0;
        for(int i=0;i<4;i++){
            System.out.println(args[i]+" ");
            sum+=Integer.parseInt(args[i]);//args[0]

        }
        System.out.println(sum);
        //for each loop
        int sum1=0;
        for(String argumentValue:args){
            sum1+=Integer.parseInt( argumentValue);
        }
        System.out.println(sum1);


    }

}
