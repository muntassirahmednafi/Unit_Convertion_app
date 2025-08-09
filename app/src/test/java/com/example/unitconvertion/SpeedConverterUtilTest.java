package com.example.unitconvertion;

import org.junit.Test;

import static org.junit.Assert.*;

public class SpeedConverterUtilTest {

    @Test
    public void testKmHtoMph() {
        double result = SpeedConverterUtil.convertSpeed(36, "km/h", "mph");
        assertEquals(22.37, result, 0.01);
    }

    @Test
    public void testMphToMps() {
        double result = SpeedConverterUtil.convertSpeed(60, "mph", "m/s");
        assertEquals(26.82, result, 0.01);
    }

    @Test
    public void testMpsToKmH() {
        double result = SpeedConverterUtil.convertSpeed(10, "m/s", "km/h");
        assertEquals(36.0, result, 0.01);
    }

    @Test
    public void testSameUnit() {
        double result = SpeedConverterUtil.convertSpeed(50, "km/h", "km/h");
        assertEquals(50, result, 0.001);
    }
}
