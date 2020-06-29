package com.pluralsight.usevariable;

public class Main {

    public static void main(String[] args) {
        int myVar;
        myVar = 50;
        System.out.println(myVar);

        int anotherVar = 100;  // Declaring a variable of type int and assigning value to it
        System.out.println(anotherVar);

        myVar = anotherVar;  // Assigning one variable to another
        System.out.println(myVar);

        anotherVar = 200;
        System.out.println(anotherVar);

        // System.out.println(myVar);

        float bigger = 0.025f;  // declaring a float. Can also be a double
        char regularU = 'U';  // declaring a character U
        boolean iLoveJava = true;  // use of a boolean data type

        System.out.println(bigger);
        System.out.println(regularU);
        System.out.println(iLoveJava);

    }
}
