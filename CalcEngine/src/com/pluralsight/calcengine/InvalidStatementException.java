package com.pluralsight.calcengine;

public class InvalidStatementException extends Exception{
    // Adding a public constructor, two arguments: reason statement is invalid and statement itself
    public InvalidStatementException(String reason, String statement){
        super(reason + ": " + statement);
    }

    public InvalidStatementException(String reason, String statement, Throwable cause){
        super(reason + ": " + statement, cause);
    }




}
