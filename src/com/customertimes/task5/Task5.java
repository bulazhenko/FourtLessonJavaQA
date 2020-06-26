package com.customertimes.task5;

//5. Create a simple class with a bunch of constructors.
// All these constructors should take different number of parameters.
// Demonstrate in your class, how we can call one constructor from another.

public class Task5 {
    int number;
    boolean bool;
    String name;

    public Task5(String name) {
        this.name = name;
        System.out.println("You are in constructor #1");
    }

    public Task5(String name, int number) {
        this(name);
        this.number = number;
        System.out.println("You are in constructor #2");
    }

    public Task5(String name, int number, boolean bool) {
        this(name, number);
        this.bool = bool;
        System.out.println("You are in constructor #3");
    }


}

