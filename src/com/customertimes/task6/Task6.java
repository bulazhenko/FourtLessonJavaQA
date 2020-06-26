package com.customertimes.task6;

//6.6. Create a simple class with any 3 fields.
// Demonstrate in your class how we can use "this" keyword to refer to the object,
// from which a constructor or a method was invoked.

public class Task6 {
    boolean firstValue = true;
    double secondValue = 44.44;
    char thirdValue = 'y';

    public Task6(boolean firstValue, double secondValue, char thirdValue) {
        System.out.println("constructor value --> " + firstValue);
        System.out.println("class value --> " + this.firstValue);
        System.out.println("constructor value --> " + secondValue);
        System.out.println("class value --> " + this.secondValue);
        System.out.println("constructor value --> " + thirdValue);
        System.out.println("class value --> " + this.thirdValue);
    }
}