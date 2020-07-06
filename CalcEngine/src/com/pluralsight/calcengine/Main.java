package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args){
        // useMathEquation();
        // useCalculatorBase();

        String[] statements = {
                "add 1.0",             // Error: incorrect number of values
                "add xx 25.0",         // Error: non-numeric data
                "addX 0.0 0.0",        // Error: invalid command
                "divide 100.0 50.0",   // 100.0 / 50.0 = 2.0
                "add 25.0 92.0",       // 25.0 + 92.0 = 117.0
                "subtract 225.0 17.0", // 225.0 - 17.0 = 208.0
                "multiply 11.0 3.0"    // 11.0 * 3.0 = 33.0
        };

        // create an instance of our calculate helper
        CalculateHelper helper = new CalculateHelper();
        for(String statement : statements){
            helper.process(statement);
            System.out.println(helper);
        }

    }

    static void useMathEquation(){
        // Parallel array calculator. Values in the same index of different arrays are used together.
        /*
        double[] leftValues = { 100.0d, 25.0d, 225.0d, 11.0d };
        double[] rightValues = { 50.0d, 92.0d, 17.0d, 3.0d };
        char[] opCodes = { 'd', 'a', 's', 'm'};
        double[] results = new double[opCodes.length];  // empty array with the length same as opCodes

         */
        MathEquation[] equations = new MathEquation[4];
        // create math array equations
        // equations[0] = create(100.0d, 50.0d, 'd');
        // equations[1] = create(25.0d, 92.0d, 'a');
        // equations[2] = create(225.0d, 17.0d, 's');
        // equations[3] = create(11.0d, 3.0d, 'm');

        // creating the array using constructors created:
        equations[0] = new MathEquation('d', 100.0d, 50.0d);
        equations[1] = new MathEquation('a', 92.0d, 25.0d);
        equations[2] = new MathEquation('s', 225.0d, 17.0d );
        equations[3] = new MathEquation('m', 3.0d, 11.0d);

        /*
	    double val1 = 100.0d;
	    double val2 = 50.0d;
	    double result;
	    char opCode = 'd';
         */

        // Using for if-else statement
        /*
        for(int i = 0; i < opCodes.length; i++) {
            if (opCodes[i] == 'a')  // Computes for addition
                results[i] = leftValues[i] + rightValues[i];
            else if (opCodes[i] == 's')  // Computes for subtraction
                results[i] = leftValues[i] - rightValues[i];
            else if (opCodes[i] == 'd') {
                results[i] = rightValues[i] != 0.0d ? leftValues[i] / rightValues[i] : 0.0d;

	       // if (rightValues[i] != 0.0d)
	       //    results = leftValues[i] / rightValues[i];
	       // else
	       //    results = 0.0d;

            } else if (opCodes[i] == 'm')  // Computes for multiplication
                results[i] = leftValues[i] * rightValues[i];
            else {
                System.out.println("Error- Invalid opCode!");  // Error message if a wrong opCode is put
                results[i] = 0.0d;
            }
        }
        */

        // Using switch case: Test possible multiple matches.
        /*
        for(int i = 0; i < opCodes.length; i++) {
        }
            switch (opCodes[i]){
                case 'a':
                    results[i] = leftValues[i] + rightValues[i];
                    break;
                case 's':
                    results[i] = leftValues[i] - rightValues[i];
                    break;
                case 'd':
                    results[i] = rightValues[i] != 0.0d ? leftValues[i] / rightValues[i] : 0.0d;
                    break;
                case 'm':
                    results[i] = leftValues[i] * rightValues[i];
                    break;
                default:
                    System.out.println("Error- Invalid opCode!");  // Error message if a wrong opCode is put
                    results[i] = 0.0d;
                    break;
            }
             */

        for(MathEquation equation: equations){
            equation.execute();
            System.out.print("Result = ");
            System.out.println(equation.getResult());
        }

        System.out.println();
        System.out.println("Using overloads!");
        System.out.println();

        double leftDouble = 9.0d;
        double rightDouble = 4.0d;
        int leftInt = 9;
        int rightInt = 4;

        MathEquation equationOverload = new MathEquation('d');
        equationOverload.execute(leftDouble, rightDouble);
        System.out.print("Results = ");
        System.out.println(equationOverload.getResult());

        equationOverload.execute(leftInt, rightInt);
        System.out.print("Results = ");
        System.out.println(equationOverload.getResult());

        System.out.println();
        System.out.println("Using Inheritance");
        System.out.println();

        // Create an array and put in values
        CalculateBase[] calculators = {
                new Divider(100.0d, 50.0d),
                new Adder(25.0d,92.0d),
                new Multiplier(11.0d, 3.0d),
                new Subtracter(225.0d, 17.0d)
        };

        // Loop through the array.
        for (CalculateBase calculator: calculators){
            calculator.calculate();
            System.out.print("Results = ");
            System.out.println(calculator.getResult());
        }


    }
    /*
    // return a new instance of math equation
    public static MathEquation create (double leftVal, double rightVal, char opCode){
        MathEquation equation = new MathEquation();
        equation.setLeftVal(leftVal);
        equation.setRightVal(rightVal);
        equation.setOpCode(opCode);

        return equation;
    }

     */

}
