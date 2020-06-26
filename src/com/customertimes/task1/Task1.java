package com.customertimes.task1;

//1. Create a class "Human". A human should have the following attributes: weight, age, first name, last name, height.
//Requirements:
//a) Create a class Human with all the required fields to store the information (variable types you could choose by yourself).
//b) Add to the class a constructor with parameters which initialize all the fields.

public class Task1 {
    class Human {
        int weight;
        int age;
        int height;
        String firstName;
        String lastName;

        Human(int weight, int age, int height, String firstName, String lastName) {
            this.weight = weight;
            this.age = age;
            this.height = height;
            this.firstName = firstName;
            this.lastName = lastName;

        }
    }
}
