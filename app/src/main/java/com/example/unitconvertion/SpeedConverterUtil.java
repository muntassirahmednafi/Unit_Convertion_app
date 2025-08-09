package com.example.unitconvertion;

public class SpeedConverterUtil {

    public static double convertSpeed(double value, String from, String to) {
        // Convert input speed to meters per second (m/s) as base unit
        switch (from) {
            case "km/h":
                value = value * 1000 / 3600;
                break;
            case "mph":
                value = value * 0.44704;
                break;
            // case "m/s": no change needed
        }

        // Convert from meters per second to target unit
        switch (to) {
            case "km/h":
                return value * 3600 / 1000;
            case "mph":
                return value / 0.44704;
            default: // "m/s"
                return value;
        }
    }
}
