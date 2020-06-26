package com.customertimes.task9;

//9. Write your own example of the recursive function.
// You can find a lot of examples on the Internet.

// Class RecursiveFunction

public class Task9 {
    public void recursive (int number, int finalNumber) {
        if (number < finalNumber){
            System.out.println("Your number is: " + number + " but we need " + finalNumber);
            recursive(number + 1, finalNumber);
        }
        else {
            System.out.println("We are finish, your number " + finalNumber);
        }
    }

}