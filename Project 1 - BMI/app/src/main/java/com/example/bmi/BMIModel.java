package com.example.bmi;

import static java.lang.Double.parseDouble;
import static java.lang.String.format;


public class BMIModel
{
    public static double toDouble(String s)
    {
        return parseDouble(s);
    }

    public static double getBMI(double weight, double height)
    {
        double bmi = weight/(height * height);

        return bmi;
    }

    public static String formatBMI(double bmi)
    {
       String s = format("%.2f", bmi);

       return s;
    }
}
