package com.example.unitconvertion;

public class WeightConverterUtil {

    public static double convertWeight(double value, String from, String to) {
        // Convert to kilograms first
        if (from.equals("Gram")) {
            value /= 1000;
        } else if (from.equals("Pound")) {
            value /= 2.20462;
        }

        // Convert from kilograms to target
        if (to.equals("Gram")) {
            value *= 1000;
        } else if (to.equals("Pound")) {
            value *= 2.20462;
        }

        // Round to 2 decimals for cleaner output
        return Math.round(value * 100.0) / 100.0;
    }
}
