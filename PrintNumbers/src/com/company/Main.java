package com.company;

public class Main
{
    public static void main(String[] args)
    {
        //2 and 3 are converted to Strings and then concatenated to 1
        System.out.println("1" + 2 + 3);

        //Since 2 + 3 is in parenthesis 2 is added to 3 and then the total is converted
        //to a String and concatenated to 1
        System.out.println("1" + (2 + 3));
    }
}
