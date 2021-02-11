package com.packt.chapter3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Example11Test {
    private static final long TEST_FACT_3 = 6;
    private static final long TEST_FACT_7 = 5040;

    @Test
    public void testFact() {
        assertEquals(TEST_FACT_3,
                     Example11.fact(3));
        assertEquals(TEST_FACT_7,
                     Example11.fact(7));
    }
}