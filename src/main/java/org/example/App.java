package org.example;
import java.util.Scanner;


/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 *  *  Copyright 2021 Yeshwanth Mandava
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner word = new Scanner(System.in);
        System.out.print("Enter any input string: ");
        String input = word.next();
        int length = input.length();
        System.out.print(input + " has " + length + " characters. ");
    }
}
