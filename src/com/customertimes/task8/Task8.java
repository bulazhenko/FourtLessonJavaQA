package com.customertimes.task8;

//8. Find the information about the order of initialation, when you create a new object of a class:
//When constructors, initialization blocks are being executed. When fields are initialized with default values.

public class Task8 {
    static int[] numArray = new int[10];

    static {
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = (int) (100.0 * Math.random());
        }
    }

    public void getArray() {
        for (int a : numArray) {
            System.out.print(a + " ");
        }
        System.out.println();
    }


}
