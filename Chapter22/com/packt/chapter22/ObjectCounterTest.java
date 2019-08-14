package com.packt.chapter22;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ObjectCounterTest {
    private ObjectCounter counter;

    @Before
    public void setUp() {
        counter = new ObjectCounter();
    }

    @Test
    public void testIncrement() {
        final int before = counter.counter;
        counter.increment();
        final int after = counter.counter;

        assertEquals(before + 1,
                     after);
    }

    @Test
    public void testGetName() {
        assertEquals(Thread.currentThread()
                           .getName(),
                     counter.getName());
    }

    @Test
    public void testDecrement() {
        final int before = counter.counter;
        counter.decrement();
        final int after = counter.counter;

        assertEquals(before - 1,
                     after);
    }
}