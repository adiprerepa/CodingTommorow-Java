package com.coding_tommorow.lessons.week_2;

public class Arrays {

    public static void main(String[] args) {

        // declaring an array of integers
        // the 'new' keyword creates a new object.
        // the [] represents an ARRAY of objects
        // the "4" represents the number of elements in the array, but in index notation
        // the REAL number of elements in the array is 5, as arrays START AT 0.
        int[] myInts = new int[4];

        // I can also put elements in the array on initialization.
        // there are 4 elements in the array, and you separate them by comma.
        int[] initializedInts = {0, 1, 2, 5};

        // you cannot change the size of an array once it is created.
        // to read elements in an array:
        int index0Element = initializedInts[0];
        int index1Element = initializedInts[1];
        int index2Element = initializedInts[2];
        int index3Element = initializedInts[3];
        System.out.printf("Elements in initializedInts are: %d, %d, %d, %d\n", index0Element, index1Element, index2Element, index3Element);

        // to write to elements in an array
        myInts[0] = 42;
        myInts[1] = 45;
        myInts[2] = 2296;
        myInts[3] = 12;
        // reading the elements we just wrote to, and printing them out.
        System.out.printf("Elements in myints, the array we just wrote to: %d, %d, %d, %d\n", myInts[0], myInts[1], myInts[2], myInts[3]);

        // If we try to access an element in the list that does not exist, because there are not that many elements,
        // we get an ArrayIndexOutOfBoundsException exception
        System.out.println(myInts[4]);
    }
}
