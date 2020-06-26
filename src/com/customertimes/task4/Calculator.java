package com.customertimes.task4;

//4. Create a class Calculator.
// It should have three fields: double firstValue, double secondValue and String operation.
// Create all required constructors to properly initialize your object.
// Consider the case when user does not provide any parameters when creates a new object.
// Write a method "calculate" that takes these two values and return the result of the calculation according to the operation.
// Write the test class which contains the main method.
// In this main method you should create your Calculator object and do some calculation to test your code,
// by calling your "calculate" method.
// Print all results to the console.

public class Calculator {
    double firstValue;
    double secondValue;
    String operation = "";

    public Calculator() {
        this(Math.random() * 100, Math.random() * 100, "*");

/*      System.out.println ("Method #2");
        System.out.println("No args constructor Calculator(), all values random: ");
        this.firstValue = Math.random() * 100;
        this.secondValue = Math.random();
        this.operation = "*";
        */
    }

    public Calculator(double firstValue, double secondValue, String operation) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.operation = operation;
    }

    public double calculate() {
        double result;
        if (operation.equals("+")) {
            return result = firstValue + secondValue;
        } else if (operation.equals("-")) {
            return result = firstValue - secondValue;
        } else if (operation.equals("*")) {
            return result = firstValue * secondValue;
        } else if (operation.equals("/")) {
            return result = firstValue / secondValue;
        } else {
            System.out.println("In operation available only following values: +,-,*,/");
            return 0;
        }
    }
}