package com.unitedcoder.javaexercises.demo1;

//import com.sun.org.apache.bcel.internal.classfile.InnerClass;

public class InnerClassDemo {
    //inner class are defined inside the body of another class
    private  String variable1="Test Automation";
    //define inner class
    //inner class be  abstract final public protecte private static

    class  InnerClassA{
        public void method1(){
            System.out.println("this is method of inner class a");

        }
    public  void innerInstance(){
        InnerClassA innercLassA=new InnerClassA();
        innercLassA.method1();


    }

        }
        //define a static inner class
          static class InnerClassB{
            public void method3(){
                System.out.println("this is method of static inner class B");

            }

              public static void main(String[] args) {
                  InnerClassDemo innerClassDemo=new InnerClassDemo();
                  System.out.println(innerClassDemo.variable1);
                  //innerClassDemo. innerInstance();
                  //a static nested class can be instantial like this
                  InnerClassDemo.InnerClassB classB=new InnerClassDemo.InnerClassB();
                  classB.method3();
              }
        }

        }

