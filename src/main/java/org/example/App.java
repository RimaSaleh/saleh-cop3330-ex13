/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Rima Saleh
 */

package org.example;

//import statement for scanner
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        //scanner used to read data inputted
        Scanner scanner = new Scanner(System.in);

        //initializing doubles for the worth
        double compound_int_total, interest_worth, worth;

        //print statement asking for the principal to be inputted
        System.out.println( "What is the principal amount? " );

        double principal = scanner.nextDouble();

        //print statement asking for the rate to be inputted
        System.out.println( "What is the rate? ");

        double rate = scanner.nextDouble();

        //print statement asking for the number of years to be inputted
        System.out.println( "What is the number of years? " );

        int years = scanner.nextInt();

        //print statement asking for the number of times interest is compounded each year to be inputted
        System.out.println( "What is the number of times the interest is compounded per year? " );

        int interest_year = scanner.nextInt();

        //calculating the worth of investing
        interest_worth = ((rate / 100) / interest_year) + 1;
        compound_int_total = Math.pow(interest_worth, (interest_year * years));
        worth = compound_int_total * principal;

        //output for compound interest value
        System.out.format( "$%.2f invested at %.2f%% for %d years compounded ", principal, rate, years);
        System.out.format( "%d times per year is $%.2f.", interest_year, worth );
    }
}
