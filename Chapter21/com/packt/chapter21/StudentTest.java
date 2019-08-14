package com.packt.chapter21;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {
    private static final String TEST_NAME = "Student Name";

    @Test
    public void testCreateStudent() {
        final Student result = new Student(TEST_NAME);

        assertEquals(TEST_NAME,
                     result.name);
    }
}