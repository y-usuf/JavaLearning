package com.pluralsight.class_1;

public class Flight {
    // creating the fields of a class which store objects.
    private int passengers;
    private int seats;

    // a constructor: set the initial state
    public Flight(){
        seats = 150;
        passengers = 0;
    }

    // creating a method: manipulates states and performs operation
    public void add1passenger(){
        if(passengers < seats)
            passengers += 1;
        else
            handleTooMany();
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
