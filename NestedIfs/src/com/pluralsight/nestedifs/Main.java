package com.pluralsight.nestedifs;

public class Main {

    public static void main(String[] args) {
	    float students = 0.0f;
	    float rooms = 4.0f;

        if (students > 0) {  // Variable outside the block can be used inside but not vice versa
            if (rooms > 0)  // Nested if statement, executes if only rooms > 0
                System.out.println(students / rooms);  // find average number of students per room
        }
        else
            System.out.println("There are no students");


	    System.out.println();
	    System.out.println("** end program **");
    }
}
