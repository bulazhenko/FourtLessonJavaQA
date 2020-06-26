package com.customertimes.runner;

import com.customertimes.task10.Task10;
import com.customertimes.task2.Boxer;
import com.customertimes.task4.Calculator;
import com.customertimes.task5.Task5;
import com.customertimes.task6.Task6;
import com.customertimes.task7.Task7;
import com.customertimes.task8.Task8;
import com.customertimes.task9.Task9;
import javafx.concurrent.Task;

// Task runner

public class Runner {
    public static void main(String[] args) {
        System.out.println("Task #2:");
        System.out.println(Boxer.fight(new Boxer(25, 80, 99)));
        System.out.println(Boxer.fight(new Boxer(25, 80, 400)));

        System.out.println("Task #4:");
        Calculator plus = new Calculator(77, 88, "+");
        System.out.println("plus: " + plus.calculate());
        Calculator minus = new Calculator(44, 22, "-");
        System.out.println("minus: " + minus.calculate());
        Calculator multiply = new Calculator(11, 77, "*");
        System.out.println("multiply: " + multiply.calculate());
        Calculator divide = new Calculator(100, 9, "/");
        System.out.println("divide: " + divide.calculate());
        Calculator empty = new Calculator();
        System.out.println(empty.calculate());

        System.out.println("Task #5:");
        //S1mple simple = new S1mple("Kit");
        //S1mple simple2 = new S1mple("kit", 10);
        Task5 simple3 = new Task5("Sneak", 10, true);

        System.out.println("Task #6:");
        Task6 keywoTard = new Task6(false, 22.3, 'n');

        System.out.println("Task #7:");
        Task7 initialization = new Task7();
        Task7 initialization2 = new Task7("Nissan Silvia s14", 23.500);
        System.out.println(initialization.getId());
        System.out.println(initialization2.getId());

        System.out.println("Task #8:");
        new Task8().getArray();
        new Task8().getArray();
        new Task8().getArray();

        System.out.println("Task #9:");
        new Task9().recursive(100, 150);

        System.out.println("Task #10:");
        new Task10().getCarPrice();
        new Task10().getCarPrice("Subaru");
        new Task10().getCarPrice("Toyota", "midnight green");
        new Task10().getCarPrice("BMW", "white", 2020);


    }
}
