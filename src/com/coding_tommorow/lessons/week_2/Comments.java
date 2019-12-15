package com.coding_tommorow.lessons.week_2;

/**
 * Comments are cool. There are three types of comments:
 * - single line comment, or //
 * - block comment, or /*
 * - documentation comment, or this comment right here
 * Comments are ignored by the compiler and do not affect
 * runtime. Add as many comments to your code as possible,
 * it is good practice.
 * the author tag tells the reader
 * who whote the code. It is good practice
 * to put your author tag in every class you edit.
 * @author aditya
 */
public class Comments {

    // I am a single line comment. I cannot go
    // on to the line below me without having
    // another "//"

    /*
    I am a block comment. I do not need another "//" below me.
     */

    /**
     * We are documenting the main method!
     * the param tag is for the programmer
     * to describe a parameter being passed into
     * the function.
     * The Main Method is where execution begins
     * in any java program, and where it ends.
     * @param args passed in during runtime
     */
    public static void main(String[] args) {
        // prints "Comments are Great!"
        System.out.println("Comments are Great!");
    }
}
