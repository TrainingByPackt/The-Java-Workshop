package com.packt.chapter3;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TemperatureTest {
    private static final double TEST_DEGREES_CELCIUS = 21.0d;
    private static final double TEST_DEGREES_FAHRENHEIT = TEST_DEGREES_CELCIUS * (9.0 / 5.0) + 32.0;
    private Temperature temperature;

    @Before
    public void setUp()
            throws
            Exception {
        temperature = new Temperature();
        temperature.t = TEST_DEGREES_CELCIUS;
    }

    @Test
    public void testGetCelsius() {
        assertEquals(TEST_DEGREES_CELCIUS,
                     temperature.getCelsius());
    }

    /**
     * Test conversion from metric to imperial.
     * <p>
     * Adds a variance to the tests since floating point values are inherently imprecise.
     */
    @Test
    public void testGetFahrenheit() {
        assertEquals(TEST_DEGREES_FAHRENHEIT,
                     temperature.getFahrenheit(),
                     0.1d);
    }
}