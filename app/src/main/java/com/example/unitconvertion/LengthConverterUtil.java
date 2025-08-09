package com.example.unitconvertion;

public class LengthConverterUtil {

    public static double convertLength(double value, String from, String to) {
        // Convert input to meters
        if (from.equals("Kilometer")) {
            value *= 1000;
        } else if (from.equals("Centimeter")) {
            value /= 100;
        }

        // Convert meters to target
        if (to.equals("Kilometer")) {
            value /= 1000;
        } else if (to.equals("Centimeter")) {
            value *= 100;
        }

        return value;
    }
}
