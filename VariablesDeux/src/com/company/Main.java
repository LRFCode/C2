package com.company;

public class Main
{
    public static void main(String[] args)
    {
        double y;               //declare y
        double z;               //declare z

        y = 7.0;                //y is now 5.0
        y = y / 2.0;            //divides y by 2.0
        System.out.println(y);  //displays 3.5

        z = y / 2.0;            //y still 3.5, z is 1.75
        System.out.println(z);  //displays 1.75
    }
}
