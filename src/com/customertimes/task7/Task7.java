package com.customertimes.task7;

//7. Create a simple class with some fields.
// Demonstrate in your class how we can use initialization blocks.

public class Task7 {
    static int nextId;
    int id;
    String car;
    double price;

    {
        System.out.println("Inside initialization block");
        id = nextId;
        nextId = nextId + 2;
    }

    static {
        nextId = (int) (Math.random() * 1000);
    }

    public Task7(String car, double price) {
        this.car = car;
        this.price = price;
    }

    public Task7() {
        this.car = "Shoes !!!";
        this.price = 1;
    }

    public int getId() {
        return this.id;
    }

}