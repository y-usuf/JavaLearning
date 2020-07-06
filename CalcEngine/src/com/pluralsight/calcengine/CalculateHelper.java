package com.pluralsight.calcengine;

public class CalculateHelper {
    private static final char ADD_SYMBOL = '+';
    private static final char SUBTRACT_SYMBOL = '-';
    private static final char MULTIPLY_SYMBOL = '*';
    private static final char DIVIDE_SYMBOL = '/';


    // Creating the fields that we need
    MathCommand command;
    double leftVal;
    double rightVal;
    double result;

    // method to accept the input string and do the work to process that string
    public void process(String statement) {
        // receive a string that looks like add 1.0 2.0 and breaks it into individual parts
        String[] parts = statement.split(" ");  // array of string called parts that splits the statement string
        // Throwing an exception handling cause:
        if(parts.length != 3)
            throw new InvalidStatementException("Incorrect number of fields", statement);

        String commandString = parts[0];  // add

        // Handling number format exceptions
        try {
            leftVal = Double.parseDouble(parts[1]);  // converts the string into a double i.e. 1.0
            rightVal = Double.parseDouble(parts[2]);  // 2.0
        } catch (NumberFormatException e){
            throw new InvalidStatementException("Non-numeric data", statement, e);
        }

        // translate string command into math command enumeration.
        setCommandFromString(commandString);

        // Look at that command and create appropriate calculate based derived class to do the work
        // and the perform the work itself
        CalculateBase calculator = null;
        switch (command){
            case Add:
                calculator = new Adder(leftVal, rightVal);
                break;
            case Subtract:
                calculator = new Subtracter(leftVal, rightVal);
                break;
            case Multiply:
                calculator = new Multiplier(leftVal, rightVal);
                break;
            case Divide:
                calculator = new Divider(leftVal, rightVal);
                break;
        }

        calculator.calculate();
        result = calculator.getResult();



    }

    // Convert command from being a string to a math command enumeration
    private void setCommandFromString(String commandString){
        // add -> MathCommand.Add

        if(commandString.equalsIgnoreCase(MathCommand.Add.toString()))
            command = MathCommand.Add;
        else if(commandString.equalsIgnoreCase(MathCommand.Subtract.toString()))
            command = MathCommand.Subtract;
        else if(commandString.equalsIgnoreCase(MathCommand.Multiply.toString()))
            command = MathCommand.Multiply;
        else if(commandString.equalsIgnoreCase(MathCommand.Divide.toString()))
            command = MathCommand.Divide;

    }

    @Override
    public String toString(){
        // output we want to produce 1.0 + 2.0 = 3.0
        char symbol = ' ';
        switch (command){
            case Add:
                symbol = ADD_SYMBOL;
                break;
            case Subtract:
                symbol = SUBTRACT_SYMBOL;
                break;
            case Multiply:
                symbol = MULTIPLY_SYMBOL;
                break;
            case Divide:
                symbol = DIVIDE_SYMBOL;
                break;
        }

        // Using string builder to show the output
        StringBuilder sb = new StringBuilder(20);
        sb.append(leftVal);
        sb.append(' ');
        sb.append(symbol);
        sb.append(' ');
        sb.append(rightVal);
        sb.append(" = ");
        sb.append(result);

        return sb.toString();

    }

}
