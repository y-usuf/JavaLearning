package com.pluralsight.letsswitch;

public class Main {

    /*
    Switch transfers control based on a value. It simplifies testing against multiple possible matches
    Only primitive types supported are Char and int
    A match can execute more than one statement; use break to avoid falling through
    Can optionally include default to handle any unmatched values
     */

    public static void main(String[] args) {

        int iVal = 20;

        switch (iVal % 2){
            case 0:
                System.out.print(iVal);
                System.out.println(" is even");
                break;
            case 1:
                System.out.print(iVal);
                System.out.println(" is odd");
                break;
            default:
                System.out.println("Oops! It broke.");
                break;
        }
    }
}
