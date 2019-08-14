package com.packt.chapter13;

import com.packt.chapter13.Exercise4.Tire;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise4Test {

    private static final int TEST_TIRE_SIZE = 26;
    private Tire tire;

    @Before
    public void setUp()
            throws
            Exception {
        tire = new Tire(TEST_TIRE_SIZE);
    }

    @Test
    public void tstTireToString() {
        assertEquals(String.valueOf(TEST_TIRE_SIZE),
                     tire.toString());
    }
}