package org.example;

import java.util.Scanner;
import java.util.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Colton Flynn
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner Obj = new Scanner(System.in);

        double taxRate = .055;

        System.out.print( "What is the order amount? ");
        Double subtotal = Double.parseDouble(Obj.nextLine());
        System.out.print( "What is the state? ");
        String state = Obj.nextLine();

        double total = subtotal;
        double tax = taxRate*subtotal;

        if (state.equals("WI"))
        {
            total=subtotal+tax;
            System.out.printf("The subtotal is $%.2f.\n",subtotal);
            System.out.printf("The tax is $%.2f.\n",tax);
        };

        System.out.printf("The total is $%.2f.",total);
    }
}