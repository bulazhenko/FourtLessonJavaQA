package com.customertimes.task3;

//3. Create 3 different classes to demonstrate the relationships "has-a" and "uses-a".
// They can be anything you want. For example: Car - Engine - Wheels

public class Task3 {
    class Engine {

        int costEngine;

        public Engine(int costEngine) {
            this.costEngine = costEngine;
        }

        public int getCost() {
            return costEngine;
        }

    }

    class Wheels {

        int costWheels;

        public Wheels(int priceWheels) {
            this.costWheels = priceWheels;
        }

        public int getCost() {
            return costWheels;
        }
    }

    class Car {
        // Has a relation
        Wheels wheels = new Wheels(4500);
        Engine engine = new Engine(13000);
        int exampleHas_a = wheels.getCost() + engine.getCost();
        // Use a relation
        Wheels wheel;

        public void exampleUses_a(Wheels wheels) {
            this.wheel = wheels;
        }
    }
}
