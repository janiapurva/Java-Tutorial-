package com.helloworld;

import java.util.Date;


/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        // Primitive data value
        // Intialize value in variable small digit with byte
        byte age = 30;
        // larger digit with int sepertate with _ for value
        int counter = 3_233;
        // for bigger integer value can be store by long
        long largeNumber = 3334_33442_24242_4424L;
        // store value in decimal point use double/flot
        float price = 10.99F;

        // store charecter use char
        char letter = 'A';
        // boolean variable
        boolean isEligible = false;

        // Reference data type for larger value to store in memory
        Date now = new Date();
        now.getTime();
        // string varable store
        String message = "Hello World";
        System.out.println(now);
        System.out.println(age);
        // insert double quote in string using backslash
        System.out.println("Hello \"Apurva\"");

        // array in Java start with int[] and assign with new keyword in int[size of
        // array]
        int[] numbers = new int[5];
        // accessing item from array
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

    }
}
