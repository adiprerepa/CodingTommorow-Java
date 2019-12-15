package com.coding_tommorow.lessons.week_2;

public class Loops {

    public static void main(String[] args) {
        // the for loop is just a loop that loops given amount of times
        // some integers
        int[] ints = {0, 1, 2, 5};

        // looping over each one
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }

        // the foreach loop - no indexes here
        for (int a : ints) {
            System.out.println(a);
        }

        // the while loop runs until a bolean value is
        // not fulfilled
        // a loop that will run forever:
        while (true) {
            // you cant break out of this, this will
            // run forever
        }

        
    }
}
