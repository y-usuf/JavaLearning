package com.pluralsight.errorhandling_2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        BufferedReader reader = null;  // declared outside try block for us to read it in the finally block
        int total = 0;

        // reading from a file, getting its line from it, converting into its integer value, adding to a total and print
        // possible errors; file doesn't exist, system error occur, bad data in the file. To avoid; wrap in a try block
        try {
            // Open the file
            reader = new BufferedReader(new FileReader("D:\\Java_101\\ErrorHandling_2\\Numbers.txt"));

            String line = null;
            while ((line = reader.readLine()) != null) // return back a null if you reach the end of file
                total += Integer.valueOf(line);  // convert string contained in line into a number
            System.out.println("Total: " + total);
        }// catch(Exception e) {  // General exception
         //   System.out.println(e.getMessage());}

         // The order of exceptions matters. First exception captured first
          catch (NumberFormatException e){  // catches the number value error
            System.out.println("Invalid value: " + e.getMessage());
        } catch (FileNotFoundException e){  // file not found error
            System.out.println("Not found: " + e.getMessage());
        } catch (IOException e){
            System.out.println("Error interacting with file: " + e.getMessage());
        } finally { // closes the file
            // protect the reader.close by a try block in case it throws an error
            try {
                if (reader != null)  // check reader if it has a valid reference before closing it
                    reader.close();
            } catch (Exception e){
                System.out.println(e.getMessage());
            }

        }


    }
}
