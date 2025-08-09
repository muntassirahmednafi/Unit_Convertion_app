package com.example.unitconvertion;

public class AreaConverterUtil {

    public static double convertArea(double value, String from, String to) {
        // Convert input to square meters first
        if (from.equals("Square Kilometer")) {
            value *= 1_000_000;
        } else if (from.equals("Square Foot")) {
            value *= 0.092903;
        }

        // Convert square meters to target unit
        if (to.equals("Square Kilometer")) {
            value /= 1_000_000;
        } else if (to.equals("Square Foot")) {
            value /= 0.092903;
        }

        // Round to 2 decimals
        return Math.round(value * 100.0) / 100.0;
    }
}
