package com.unitedcoder.interfaceconcetpt;

public class TestCalculator {
    public static void main(String[] args) {
        IsimpleCalculator calculator=new Calculator();
        IscientificCalculator calculator1=new Calculator();
        calculator.addTwoNumbers(100,200);
        calculator.divideTwoNumbers(10,2);
        calculator.multiplyTwoNumbers(20,90);
        calculator.substractTwoNubers(90,20);
        System.out.println("scientific calculator result----------*********");
        calculator1.calculaAbsoluteValue(-30);
        calculator1.calculatePower(10,2);
        calculator1.calculateSquareRoot(94);

    }
}
