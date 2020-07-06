package com.pluralsight.calcengine;

public abstract class CalculateBase {  // abstract class has to be inherited from
    // Common point of inheritance for our operations
    // Series of fields declared (common to all operations)
    private double leftVal;
    private double rightVal;
    private double result;

    //getters and setter for each of the fields (Accessors and mutators)
    public double getLeftVal() { return leftVal; }
    public void setLeftVal(double leftVal) { this.leftVal = leftVal; }
    public double getRightVal() { return  rightVal; }
    public void setRightVal(double rightVal) { this.rightVal = rightVal; }
    public double getResult(){ return result; }
    public void setResult(double result) { this.result = result; }

    // Constructors
    public CalculateBase(){}

    public CalculateBase(double leftVal, double rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    // Since calculation takes different forms, we will form an abstract void method
    // create a new class for each instant operation and extend from this class
    public abstract void calculate();



}
