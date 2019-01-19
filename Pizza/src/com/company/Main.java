package com.company;

public class Main
{
    public static void main(String[] args)
    {
        double minSliceSize = 13.0;

        double smallPizzaDiameter = 10.0;
        double mediumPizzaDiameter = 12.0;

        double smallPizzaRadius = smallPizzaDiameter / 2;
        double mediumPizzaRadius = mediumPizzaDiameter / 2;

        double smallPizzaArea = 3.14 * (smallPizzaRadius * smallPizzaRadius);
        double mediumPizzaArea = 3.14 * (mediumPizzaRadius * mediumPizzaRadius);

        //Use a double to hold results to make display come out with a .0
        //Could have used an int and appended ".0" when printing instead
        double numberSmallSlices = (int) (smallPizzaArea / minSliceSize);
        double numberMediumSlices = (int) (mediumPizzaArea / minSliceSize);

        System.out.println("A 10 inch pizza will yield " + numberSmallSlices + " slices.");
        System.out.println("A 12 inch pizza will yield " + numberMediumSlices + " slices.");
    }
}