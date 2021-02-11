package com.packt.chapter3;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TabletTest {
    private static final double TEST_SCREEN_SIZE = 10.0d;
    private Tablet tablet;

    @Before
    public void setUp()
            throws
            Exception {
        tablet = new Tablet();
    }

    /**
     * Test both the getter and the setting.
     */
    @Test
    public void testScreenSize() {
        tablet.setScreenSize(TEST_SCREEN_SIZE);
        assertEquals(TEST_SCREEN_SIZE,
                     tablet.getScreenSize());
    }
}