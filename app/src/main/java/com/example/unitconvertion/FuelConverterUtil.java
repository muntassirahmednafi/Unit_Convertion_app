package com.example.unitconvertion;

public class FuelConverterUtil {

    public static double convertFuel(double value, String from, String to) {
        // Convert input to km/L first
        if (from.equals("mpg")) {
            value *= 0.4251; // 1 mpg ≈ 0.4251 km/L
        } else if (from.equals("L/100km")) {
            value = 100 / value; // inverse
        }

        // Convert from km/L to target
        if (to.equals("mpg")) {
            value /= 0.4251;
        } else if (to.equals("L/100km")) {
            value = 100 / value;
        }

        // Round to 2 decimals
        return Math.round(value * 100.0) / 100.0;
    }
}
