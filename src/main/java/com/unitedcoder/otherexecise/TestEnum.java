package com.unitedcoder.otherexecise;
enum level{
    Low,Medium,High
}
public class TestEnum {
    public static void main(String[] args) {
        System.out.println(level.Low);
        level l=level.Low;
        switch (l){
            case Low :
                System.out.println("low level");
                break;
            case Medium:
                System.out.println("Medium level");
                break;
            case  High:
                System.out.println("High level");
                break;
        }
    }

}
