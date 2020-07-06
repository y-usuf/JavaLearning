package com.pluralsight.class_1;

public class Flight {
    // creating the fields of a class which store objects.
    int seats = 150, passengers;
    int totalCheckedBags;
    int maxCarryOns = 2 * seats, totalCarryOns;


    // a constructor: set the initial state
    // public Flight(){
        // seats = 150;
        // passengers = 0;
//    }

    // creating a method: manipulates states and performs operation
    public void add1passenger(){
        if (hasSeating())
            passengers += 1;
        else
            handleTooMany();
    }
    // Overloading add1passenger: keeping track of checked bags
    public void add1passenger(int bags){
        if(hasSeating()) {
            add1passenger();  // call existing add1passenger
            totalCheckedBags += bags;  // add bags they have to total checked bags
        }
    }

    // method to check for number of seats available.
    private boolean hasSeating(){
        return passengers < seats;
    }

    // Method to check if there is space based on the number of carryOns a passenger has.
    private boolean hasCarryOnSpace(int carryOn){
        return totalCarryOns + carryOn <= maxCarryOns;
    }

    // handleTooMany method that gets called from passenger
    private void handleTooMany(){
        System.out.println("Too many!");
    }

    // method checks if the plane is full or not
    public boolean hasRoom(Flight f2){
        int total = this.passengers + f2.passengers;
        /*
        if (total <= seats)
            return true;
        else
            return false;
         */
        return total <= seats;
    }

    public Flight createNewWithBoth(Flight f2){
        Flight newFlight = new Flight();
        newFlight.seats = seats;
        newFlight.passengers = passengers + f2.passengers;
        return newFlight;
    }


}
