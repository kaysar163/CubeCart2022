package com.unitedcoder.lambdaexpression;

import java.lang.annotation.Annotation;

@FunctionalInterface
public interface FunctionalInterfaceDem1 {
    void book();

}
class Test implements FunctionalInterfaceDem1{

    @Override
    public void book() {
        System.out.println("Reading book.......");

    }

}
    class  Testclass{
        public static void main(String[] args) {
           // FunctionalInterfaceDem1 de demo1=new Test();
           // demo1.book();
            FunctionalInterfaceDem1 demo1=()-> System.out.println("i am Reading.......");
            demo1.book();

        }
}