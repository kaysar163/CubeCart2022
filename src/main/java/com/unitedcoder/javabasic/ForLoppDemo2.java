package com.unitedcoder.javabasic;

public class ForLoppDemo2 {
    public static void main(String[] args) {
        //argument 4 value
        int sum=0;
        for(int i=0;i<4;i++){
            System.out.println(args[i]+"  ");
            sum+=Integer.parseInt(args[1]);

        }
        System.out.println(sum);




        int sum3=0;
        for(int i=1;i<=10;i++){
            sum3+=i;// sum=sum+i
        }
        System.out.println("total sum :"+sum3);

        int factorial=1;
        for(int i=1;i<=5;i++){
            factorial*=i;//factorial*i
            System.out.printf("i=%d factorail=%d\n",i,factorial);
        }
        System.out.println("factirial: "+factorial);
        //count even  number
        int evenNumberCounts=0;
        for(int j=0;j<=100;j++){
            if(j!=0 && j%2==0){
               evenNumberCounts++;
            }
        }
        System.out.println("total even number is :"+evenNumberCounts);




            }
        }






