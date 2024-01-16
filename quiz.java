package com.mycompany.quiz;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        // Speed = Distance / Time.
        double distance, time, speed;
        
        // Define a scanner for input.
        Scanner scnr = new Scanner(System.in);
        
        // Prompt the user for input
        System.out.println("How many meters did you travel?");
        
        distance = scnr.nextDouble();
        
        System.out.println("How many seconds have elapsed during your travel?");
        time = scnr.nextDouble();
        
        
        // Travelling a distance with time being zero is impossible, exit program.
        if ( time == 0 ) {
            System.out.println("It is impossible to travel any distance without time elapsing, calculation failed!");
            return;
        } 
        // Time also can't be negative in this case.
        else if ( time < 0 ) {
            {System.out.println("Time travel is not possible in this case, terminating operation"); return;}
        }
        // Calculate on the case that time is not zero, since speed is a scalar, we are not going to have a negative value.
        else if (distance < 0) speed = -(distance / time);
        else speed = distance / time;
        
        // Output the result
        System.out.println("Calculation successful!");
        System.out.println("The speed in your car is: " + speed + "m/s.");
        
    }
}
