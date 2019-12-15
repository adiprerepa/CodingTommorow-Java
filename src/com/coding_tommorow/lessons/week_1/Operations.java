package com.coding_tommorow.lessons.week_1;

public class Operations {

    public static void main(String[] args) {

        /*
         basic integer operations
         */
        // prints remainder of 10/2 - or 0
        int a = 10;
        System.out.printf("%d / 2 remainder = ", a);
        System.out.println(a % 2);

        // prints remainder of 11/2 - or 1
        a = 11;
        System.out.printf("%d / 2 remainder = ", a);
        System.out.println(a % 2);

        // subtract from a, and assign it to a - prints 1 (11-10 = 1)
        System.out.printf("%d - 10 = ", a);
        a -= 10;
        System.out.println(a);

        // add to a, and assign it to a - prints 20 (1 + 19 = 20)

        System.out.printf("%d + 19 = ", a);
        a += 19;
        System.out.println(a);

        // multiply by a, and assign to a - prints 40 (20 * 2 = 40)

        System.out.printf("%d * 2 = ", a);
        a *= 2;
        System.out.println(a);

        // divide by a, and assign to a - prints 1 (40 / 40 = 1)

        System.out.printf("%d / 40 = ", a);
        a /= 40;
        System.out.println(a);

        // use the inbuilt math library to raise numbers to powers
        // the following is raising a, or 1, to the power of 2.
        // 1^2 = 1*1 = 1, so a should now be 1.
        System.out.printf("%d ^ 2 = ", a);
        a = (int) Math.pow(a, 2);
        System.out.println(a);

        // make it bigger :)
        // should print 61^2, or 3721
        a *= 61; // a is now 61
        System.out.printf("%d ^ 2 = ", a);
        a = (int) Math.pow(a, 2);
        System.out.println(a);

        // take the square root of a - should print 61,
        // because 3721^0.5 = 61.
        System.out.printf("%d ^ 0.5", a);
        a = (int) Math.sqrt(a); // a is now 61
        System.out.println(a);

        /*
        Basic String operations
         */
        String str = "Java is a peculiar language.";
        // print length of string
        System.out.print("String Length : ");
        System.out.println(str.length());

        // add one string to another with concat()
        str = str.concat(" SIKE ITS GREAT");
        System.out.println(str);

        // find character at certain index of string
        // should print 'J'
        System.out.printf("String at index 0 : %c\n", str.charAt(0));

        // split string by character
        // print all strings separated by a whitespace
        String[] strings = str.split(" ");
        for (String string : strings) {
            System.out.println(string);
        }

    }
}
