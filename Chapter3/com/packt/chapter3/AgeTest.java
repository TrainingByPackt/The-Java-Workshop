package com.packt.chapter3;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AgeTest {
    private static final int TEST_AGE_YEARS = 35;
    private static final int TEST_AGE_MONTHS = 3;
    private static final double TEST_AGE_WITH_TWO_VALUES = 35.25d;
    private Age age;

    @Before
    public void setUp()
            throws
            Exception {
        age = new Age();
    }

    @Test
    public void testAgeAsSingleValue() {
        age.setAge(TEST_AGE_YEARS);
        assertEquals((double) TEST_AGE_YEARS,
                     age.getAge());
    }

    @Test
    public void testAgeAsYearsAndMonths() {
        age.setAge(TEST_AGE_YEARS,
                   TEST_AGE_MONTHS);
        assertEquals(TEST_AGE_WITH_TWO_VALUES,
                     age.getAge(),
                     0.1d);
    }
}