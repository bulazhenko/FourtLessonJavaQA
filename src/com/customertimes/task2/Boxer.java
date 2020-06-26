package com.customertimes.task2;

//2. Implement the method fight() depending on weight, strength and age of the boxer:
//You should write dependency by yourself. The method should return true or false if our boxer won or lost.
//Requirements:
//a) if ourBoxer.fight(anotherBoxer) returns true, then anotherBoxer.fight(outBoxer) should return false;

public class Boxer {
    public int age;
    public int weight;
    public int strength;

    public Boxer(int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    static Boxer ourBoxer = new Boxer(25, 75, 300);

    public static boolean fight(Boxer anotherBoxer) {
        boolean result;
        if ((ourBoxer.age < anotherBoxer.age && ourBoxer.weight > anotherBoxer.weight) ||
                (ourBoxer.strength - anotherBoxer.strength) > 100) {
            result = true;
            return result;
        } else {
            result = false;
            return result;
        }
    }
}