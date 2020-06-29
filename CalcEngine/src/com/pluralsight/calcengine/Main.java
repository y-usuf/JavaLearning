package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {
        // Parallel array calculator. Values in the same index of different arrays are used together.
        /*
        double[] leftValues = { 100.0d, 25.0d, 225.0d, 11.0d };
        double[] rightValues = { 50.0d, 92.0d, 17.0d, 3.0d };
        char[] opCodes = { 'd', 'a', 's', 'm'};
        double[] results = new double[opCodes.length];  // empty array with the length same as opCodes

         */
        MathEquation[] equations = new MathEquation[4];
        // create math array equations
        equations[0] = create(100.0d, 50.0d, 'd');
        equations[1] = create(25.0d, 92.0d, 'a');
        equations[2] = create(225.0d, 17.0d, 's');
        equations[3] = create(11.0d, 3.0d, 'm');

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

    }
    // return a new instance of math equation
    public static MathEquation create (double leftVal, double rightVal, char opCode){
        MathEquation equation = new MathEquation();
        equation.setLeftVal(leftVal);
        equation.setRightVal(rightVal);
        equation.setOpCode(opCode);

        return equation;
    }
}
