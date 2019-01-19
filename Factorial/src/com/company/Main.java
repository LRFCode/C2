package com.company;

public class Main
{
    public static void main(String[] args)
    {
        int factorial4 = 4 * 3 * 2 * 1;
        System.out.println("The Factorial of 4 is:  " + factorial4);

        int factorial7 = 7 * 6 * 5 * factorial4;
        System.out.println("The Factorial of 7 is:  " + factorial7);
    }
}
