package com.pluralsight.letsarray;

public class Main {

    // Arrays provide an ordered collection of elements
    // Each member of the array are accessed through an index

    public static void main(String[] args) {

        float[] theVals = { 10.0f, 20.0f, 15.0f, 12.0f }; // stores each value in the array

        /*
        float[] theVals = new float[3]; // [] declares theVals as an array. Allocate space to store three float values
        theVals[0] = 10.0f;  // stores the value in the 1st index of the array
        theVals[1] = 20.0f;
        theVals[2] = 15.0f;

         */

        float sum = 0.0f;  // initialize sum to 0
        for(int i = 0; i < theVals.length; i++)  // loops through the length of the array moving to the next index
            sum += theVals[i];  // sums up the values in each index of the array

        System.out.println(sum);

        // for-each loop: handles getting collection length and accessing each value
        // for(loop-variable-declaration: array)
        //     statement;
        float sum_again = 0.0f;  // initialize sum_again to zero
        for(float currentVal: theVals)  // loop-variable-declaration
            sum_again += currentVal;  // adds consecutively in the array

        System.out.println(sum_again);

    }
}
