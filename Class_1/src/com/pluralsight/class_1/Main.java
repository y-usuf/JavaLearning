package com.pluralsight.class_1;

public class Main {

    public static void main(String[] args) {
	    // Creating a class instance
        Flight f1 = new Flight();
        Flight f2 = new Flight();

        // add passengers to both flights
        f1.add1passenger();
        f1.add1passenger();
        f2.add1passenger();

        Flight f3 = null;
        if(f1.hasRoom(f2))
            f3 = f2.createNewWithBoth(f2);

        if(f3 != null)
            System.out.println("Flights combined!");


    }
}
