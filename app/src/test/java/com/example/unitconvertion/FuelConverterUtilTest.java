package com.example.unitconvertion;

import org.junit.Test;

import static org.junit.Assert.*;

public class FuelConverterUtilTest {

    @Test
    public void testMpgToKmL() {
        double result = FuelConverterUtil.convertFuel(30, "mpg", "km/L");
        assertEquals(12.75, result, 0.01);
    }

    @Test
    public void testKmLToMpg() {
        double result = FuelConverterUtil.convertFuel(15, "km/L", "mpg");
        assertEquals(35.29, result, 0.01);
    }

    @Test
    public void testL100kmToKmL() {
        double result = FuelConverterUtil.convertFuel(8, "L/100km", "km/L");
        assertEquals(12.5, result, 0.01);
    }

    @Test
    public void testKmLToL100km() {
        double result = FuelConverterUtil.convertFuel(20, "km/L", "L/100km");
        assertEquals(5.0, result, 0.01);
    }
}
