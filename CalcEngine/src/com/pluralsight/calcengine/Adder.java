package com.pluralsight.calcengine;

// This class focuses on one aspect of the program, addition

public class Adder extends CalculateBase {
    // constructors are not inherited. All classes are responsible for creating their own
    public Adder(){}  // No argument constructor
    public Adder(double leftVal, double rightVal){
        super(leftVal, rightVal);  // Constructor calling into the base class constructors using the super keyword
    }

    // Implement the way an adder does its calculate
    @Override
    public void calculate(){
        double value = getLeftVal() + getRightVal();
        setResult(value);

    }


}
