package com.packt.chapter3;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Exercise 1 JUnit tests.
 */
public class ComputerTest {
    private static final double TEST_CPU_SPEED = 4.3d;
    private Computer computer;

    /**
     * Create the instance of Computer before each test.
     */
    @Before
    public void setUp()
            throws
            Exception {
        computer = new Computer();
    }

    /**
     * Ensures the default CPU speed value is set.
     */
    @Test
    public void getCpuSpeed() {
        assertEquals(0.0d,
                     computer.getCpuSpeed());
    }

    /**
     * Ensures that setting a speed is stored in the object.
     */
    @Test
    public void setCpuSpeed() {
        computer.setCpuSpeed(TEST_CPU_SPEED);
        assertEquals(TEST_CPU_SPEED,
                     computer.getCpuSpeed());
    }
}
