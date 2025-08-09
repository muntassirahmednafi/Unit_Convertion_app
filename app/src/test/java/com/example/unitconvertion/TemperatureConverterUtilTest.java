package com.example.unitconvertion;

import org.junit.Test;

import static org.junit.Assert.*;

public class TemperatureConverterUtilTest {

    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(212.0, TemperatureConverterUtil.convertTemperature(100, "Celsius", "Fahrenheit"), 0.001);
    }

    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(0.0, TemperatureConverterUtil.convertTemperature(32, "Fahrenheit", "Celsius"), 0.001);
    }

    @Test
    public void testKelvinToCelsius() {
        assertEquals(0.0, TemperatureConverterUtil.convertTemperature(273.15, "Kelvin", "Celsius"), 0.001);
    }

    @Test
    public void testCelsiusToKelvin() {
        assertEquals(373.15, TemperatureConverterUtil.convertTemperature(100, "Celsius", "Kelvin"), 0.001);
    }

    @Test
    public void testFahrenheitToKelvin() {
        assertEquals(373.15, TemperatureConverterUtil.convertTemperature(212, "Fahrenheit", "Kelvin"), 0.001);
    }
}
