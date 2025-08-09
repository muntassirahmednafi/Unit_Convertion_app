package com.example.unitconvertion;

public class VolumeConverterUtil {

    public static double convertVolume(double value, String from, String to) {
        // Convert input to Liters
        if (from.equals("Milliliter")) {
            value /= 1000;
        } else if (from.equals("Cubic Meter")) {
            value *= 1000;
        }

        // Convert Liters to target unit
        if (to.equals("Milliliter")) {
            value *= 1000;
        } else if (to.equals("Cubic Meter")) {
            value /= 1000;
        }

        // Round to 2 decimals
        return Math.round(value * 100.0) / 100.0;
    }
}
