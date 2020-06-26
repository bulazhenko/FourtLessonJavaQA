package com.customertimes.task10;

//10. Create a simple class with overloaded methods.
// Write another class to demonstrate the concept of methods overloading.

// Class OverloadedMethod

public class Task10 {
    public void getCarPrice() {
        System.out.println("We can't understand what a car you need!");
    }

   public void getCarPrice(String name) {
        System.out.println("Ok but?: " + name + " what colour ?");
    }

    public void getCarPrice(String name, String color) {
        System.out.println("Ok but? " + name + " " + color + " what year ?");
    }

    public void getCarPrice(String name, String color, int year) {
        System.out.println(": " + name + " " + color + " " + year);
        int price = year * 100;
        System.out.println("Total Price: " + price + "$");
    }
}
