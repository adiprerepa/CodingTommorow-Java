package com.coding_tommorow.lessons.week_1;

public class Variables {

    /*
    Variable Examples
     */


    public static void main(String[] args) {
        // to assign a variable to a value
        int a = 20;
        boolean bool = true;
        double myDouble = 10.0;
        byte b = 0x011;
        String string = "Java is Great!";
        char c = 'a';

        // operations same for ints, doubles, and bytes
        // assign another value to 'a' (20 -> 30)
        a = 30;
        // add 5 to variable a
        // same thing as a = a + 5 (take previous value of a, add 5, and assign it to a
        a += 5;
        // print a - should print 25
        System.out.println(a);

        // print value of 'bool'
        System.out.println(bool);
        // set bool to false
        bool = false;
        System.out.println(bool);
        // toggle bool to opposite state - should be true
        bool = !bool;
        System.out.println(bool);

        // print variable c - should print 'a'
        System.out.println(c);
        // print 'b' - this works because characters are just ascii, or numbers
        c += 1;
        System.out.println(c);
        // chars can only be assigned with single quotes, with only one character
        c = 'f';
        System.out.println(c);

        // print 'string' - should print "Java is Great!"
        // a string is just a bunch of characters
        System.out.println(string);
        // add to the front of a string
        string = "This is False: " + string;
        System.out.println(string);
        // add to end of string
        string +=" :) I was lying";
        System.out.println(string);
        // there are a lot of other string operations you can perform

    }

}
