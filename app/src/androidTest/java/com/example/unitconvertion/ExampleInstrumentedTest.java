package com.example.unitconvertion;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LengthConverterFullTest {

    private final double input;
    private final String fromUnit;
    private final String toUnit;
    private final double expected;

    public LengthConverterFullTest(double input, String fromUnit, String toUnit, double expected) {
        this.input = input;
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}: convertLength({0} {1} to {2}) = {3}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1000, "Meter", "Kilometer", 1.0},
                {1, "Kilometer", "Meter", 1000.0},
                {200, "Centimeter", "Meter", 2.0},
                {3, "Meter", "Centimeter", 300.0}
        });
    }

    @Test
    public void testParameterizedConversion() {
        double result = LengthConverterUtil.convertLength(input, fromUnit, toUnit);
        assertEquals(expected, result, 0.0001);
    }

    @Test
    public void testMetersToKilometers_Equals() {
        double result = LengthConverterUtil.convertLength(1000, "Meter", "Kilometer");
        assertEquals(1.0, result, 0.0001);
    }

    @Test
    public void testKilometersToMeters_NotEquals() {
        double result = LengthConverterUtil.convertLength(1, "Kilometer", "Meter");
        assertNotEquals(500, result);
    }

    @Test
    public void testPositiveConversion_True() {
        double result = LengthConverterUtil.convertLength(5, "Meter", "Centimeter");
        assertTrue(result > 0);
    }

    @Test
    public void testNegativeConversion_False() {
        double result = LengthConverterUtil.convertLength(5, "Meter", "Centimeter");
        assertFalse(result < 0);
    }
}
