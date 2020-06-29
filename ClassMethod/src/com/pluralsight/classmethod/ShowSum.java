package com.pluralsight.classmethod;

public class ShowSum {

    // creating a method
    public void showSum(float x, float y, int count){
        // checks if count is less than one and returns
        if(count < 1)
            return;

        // finds the sum of x and y and prints it count number of times
        float sum = x + y;
        for(int i = 0; i < count; i++)
            System.out.println(sum);

        return;
    }

}
