package com.pluralsight.logicaloperators;

public class Main {

    public static void main(String[] args) {
	    // Logical operators; and (&), or(|), ExclusiveOr (^), Negation (!)
        int a = 20, b = 14, c = 5;

        if (a > b & b > c)
            System.out.println("a is greater than c");

        boolean done = false;

        if (!done)  // if not done, print Keep going
            System.out.println("Keep going!");

        // Conditional logical operators, &&
        int students = 150;
        int room = 0;

        if (room > 0 && students/room > 30) // right hand side executed if left hand side is true
            System.out.println("Crowded!!");

        System.out.println();
        System.out.println("** end program **");
    }
}
