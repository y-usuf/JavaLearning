package com.pluralsight.conditional_logic;

public class Main {

    public static void main(String[] args) {
	    // Conditional assignment. Assign a value to a variable based on result of condition
        // result = condition ? true-value : false-value;

        int v1 = 10, v2 = 40;
        int vMax = v1 > v2 ? v1 : v2;  // if V1 is greater, prints the first value v2
        System.out.println(vMax);

        float students = 30, room = 4;
        float studentsPerRoom = room == 0.0f ? 0.0f : students/room;
        System.out.println(studentsPerRoom);

        // if-else statement
        if (v1 > v2)
            System.out.println("V1 is bigger");
        else if (v1 < v2)
            System.out.println("v2 is bigger");
        else
            System.out.println("v1 and v2 are equal");
    }
}
