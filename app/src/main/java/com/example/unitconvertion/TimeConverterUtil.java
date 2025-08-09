package com.example.unitconvertion;

public class TimeConverterUtil {

    public static double convertTime(double value, String from, String to) {
        // Convert input to seconds
        switch (from) {
            case "Minutes": value *= 60; break;
            case "Hours": value *= 3600; break;
            case "Days": value *= 86400; break;
            // case "Seconds": no change
        }

        // Convert seconds to target unit
        switch (to) {
            case "Minutes": return value / 60;
            case "Hours": return value / 3600;
            case "Days": return value / 86400;
            default: return value; // Seconds
        }
    }
}
