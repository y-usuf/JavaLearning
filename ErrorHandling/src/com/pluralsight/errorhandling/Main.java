package com.pluralsight.errorhandling;

public class Main {

    // Error handling using exceptions
    public static void main(String[] args) {

        int i = 12;
        int j = 2;  // if j = 2, error will occur.

        // Using exception
        try {
            int results = i / (j - 2);
            System.out.println(results);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }


    }
}
