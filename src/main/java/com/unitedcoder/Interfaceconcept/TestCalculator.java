package com.unitedcoder.Interfaceconcept;

public class TestCalculator {
    public static void main(String[] args) {
        ISimpleCalculator calculator=new Calcilator();
        IScientificCalculator calculator1=new Calcilator();
        calculator.addTwoNumbers(100,200);
       // calculator.diviedTwoNumbers(10,2);

        System.out.println(calculator.diviedTwoNumbers(10,2));
        calculator.multiplyTwoNumbers(20,90);
        calculator.substractTwoNumbers(90,20);
        System.out.println("scientific calculator result ---------***********");
        System.out.println(calculator1.calculateAbsoluteValue(-30));
        System.out.println(calculator1.calculatePower(10,2));
        System.out.println(calculator1.calculateSquareRoot(9));
    }
}
