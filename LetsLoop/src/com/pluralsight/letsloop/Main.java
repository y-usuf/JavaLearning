package com.pluralsight.letsloop;

public class Main {

    public static void main(String[] args) {
	    // While loop-checks condition at the beginning of the loop. Finding the factorial of a number
        int kVal = 10, factorial = 1;

        while (kVal > 1)
            factorial *= kVal--;  // performs the same factorial as kVal is decremented by 1 each time
        /*
        {
            factorial *= kVal;
            kVal -= 1;
        } */
        System.out.println(factorial);


        // Do-while loop: checks condition at the end of the loop. Will print at least one value
        int iVal = 5;

        do {
            System.out.print(iVal);  // print statement doesn't move to a new line after the print
            System.out.print(" * 2 = ");   // Will look like 5 * 2 =
            iVal *= 2;
            System.out.println(iVal);
        } while (iVal < 100);


        // For Loop: Condition checked at the start of the loop. Like while loop
        // for (initialize; condition; update);
        //     statement;
        // Provide simplified notation for loop control.

        for(int val = 5; val < 100; val *= 2){
            System.out.println(val);
        }


    }
}
