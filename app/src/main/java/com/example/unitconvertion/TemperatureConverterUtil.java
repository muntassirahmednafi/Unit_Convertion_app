package com.example.unitconvertion;

public class TemperatureConverterUtil {

    public static double convertTemperature(double value, String from, String to) {
        // Convert from source unit to Celsius
        switch (from) {
            case "Fahrenheit":
                value = (value - 32) * 5.0 / 9.0;
                break;
            case "Kelvin":
                value = value - 273.15;
                break;
            // case "Celsius": no change
        }

        // Convert from Celsius to target unit
        switch (to) {
            case "Fahrenheit":
                return (value * 9.0 / 5.0) + 32;
            case "Kelvin":
                return value + 273.15;
            default: // Celsius
                return value;
        }
    }
}
