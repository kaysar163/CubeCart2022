package com.unitedcoder.arrayexercises;

public class DimentionArray {
    public static void main(String[] args) {
        int[][]a1=new int[4][];
        int[][] array={
                {1,2,3},
                {6,9,10,70},
                { 30,90},
                {20,80,30,5,8,10},
        };
       // System.out.println(array.length);
       // System.out.println(array[1].length);
        //System.out.println(array[3].length);
        //System.out.println(array[1][1]);
       // System.out.println(array[3][2]);
       // System.out.println(array[2][1]);

        int sum=0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.println(array[i][j]+" ");
                sum+=array[i][j];
            }
            //System.out.println();
           // System.out.println("each sum"+sum);
        }
        System.out.print("sum of array:"+sum);


    }
}
