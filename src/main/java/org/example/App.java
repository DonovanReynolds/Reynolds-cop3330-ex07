package org.example;

import java.util.Scanner;

/*
 *   UCF COP 3330 Fall 2021 Assignment 7 Solution
 *   Copyright 2021 Donovan Reynolds
 */
public class App 
{
    public static void main( String[] args )
    {
        final double conversion = 0.09290304;
        String lengthText = inputOutput("What is the length of the room in feet?");
        String widthText = inputOutput("What is the width of the room in feet?");

        int length = Integer.parseInt(lengthText);
        int width = Integer.parseInt(widthText);

        int area = length * width;
        double areaMeters = area * conversion;

        System.out.println("You entered dimensions of " + length + " feet by " + width + " feet.");
        System.out.println("The area is:");
        System.out.println(area + " square feet");
        System.out.printf("%.3f square meters" , areaMeters);
    }

    public static String inputOutput(String textToSay)
    {
        Scanner input = new Scanner(System.in);
        System.out.println(textToSay);
        return input.nextLine();

    }
}
