package com.example.unitconvertion;

import org.junit.Test;
import static org.junit.Assert.*;

public class WeightConverterUtilTest {

    // ----- Basic Conversions -----
    @Test
    public void testKilogramToGram() {
        double result = WeightConverterUtil.convertWeight(1, "Kilogram", "Gram");
        assertEquals(1000.0, result, 0.001);
        assertNotEquals(999.0, result, 0.001); // Should not match wrong value
        assertTrue(result > 500);              // Logical check
    }

    @Test
    public void testGramToKilogram() {
        double result = WeightConverterUtil.convertWeight(1000, "Gram", "Kilogram");
        assertEquals(1.0, result, 0.001);
        assertTrue(result <= 1.0);
        assertFalse(result < 0); // Can't be negative
    }

    @Test
    public void testPoundToKilogram() {
        double result = WeightConverterUtil.convertWeight(2.20462, "Pound", "Kilogram");
        assertEquals(1.0, result, 0.001);
        assertNotEquals(2.0, result, 0.001);
    }



    // ----- Same Unit Conversions -----
    @Test
    public void testSameUnitConversion() {
        double result = WeightConverterUtil.convertWeight(50, "Gram", "Gram");
        assertEquals(50.0, result, 0.001);
        assertTrue(result == 50.0);
        assertNotEquals(51.0, result, 0.001);
    }

    // ----- Edge Cases -----
    @Test
    public void testZeroValue() {
        double result = WeightConverterUtil.convertWeight(0, "Kilogram", "Gram");
        assertEquals(0.0, result, 0.001);
        assertFalse(result > 0);
    }

    @Test
    public void testNegativeValue() {
        double result = WeightConverterUtil.convertWeight(-1, "Kilogram", "Gram");
        assertEquals(-1000.0, result, 0.001);
        assertTrue(result < 0);
    }

    @Test
    public void testLargeValueConversion() {
        double result = WeightConverterUtil.convertWeight(1_000_000, "Kilogram", "Gram");
        assertEquals(1_000_000_000.0, result, 0.001);
        assertTrue(result > 1_000_000);
    }
}
