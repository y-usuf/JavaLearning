package com.pluralsight.calcengine;

public class MathEquation {

    private double leftVal;
    private double rightVal;
    private char opCode  = 'a';
    private double result;

    // using accessors and mutators
    public double getLeftVal() {
        return leftVal;
    }
    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }
    public double getRightVal() {
        return rightVal;
    }
    public void setRightVal(double rightVal) {

        this.rightVal = rightVal;
    }
    public char getOpCode() {

        return opCode;
    }
    public void setOpCode(char opCode) {
        this.opCode = opCode;
    }
    // Results has an accessor only not mutator. Read only value but can't be accessed outside
    public double getResult() {
        return result;
    }

    // constructors and initializer
    public MathEquation() {}

    public MathEquation(char opCode){
        this.opCode = opCode;
    }

    public MathEquation(char opCode, double leftVal, double rightVal){
        this(opCode);  // chaining a constructor together
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    public void execute(double leftVal, double rightVal){
        this.leftVal = leftVal;
        this.rightVal = rightVal;

        execute();
    }
    // Carters for an integer value
    public void execute(int leftVal, int rightVal){
        this.leftVal = leftVal;
        this.rightVal = rightVal;

        execute();
        result = (int)result;
    }



    // public method execute, void; returns nothing and takes no parameters
    public void execute(){
        switch (opCode){
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'd':
                result = rightVal != 0.0d ? leftVal / rightVal : 0.0d;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            default:
                System.out.println("Error- Invalid opCode!");  // Error message if a wrong opCode is put
                result = 0.0d;
                break;
        }



    }
}
