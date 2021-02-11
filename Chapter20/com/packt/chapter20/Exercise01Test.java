package com.packt.chapter20;

import com.packt.chapter20.Exercise01.Human;
import org.junit.Test;

import static junit.framework.TestCase.*;

public class Exercise01Test {
    private static final String TEST_NAME = "Test Name";
    private static final int TEST_AGE = 36;
    private static final String TEST_GENDER = "M";

    @Test
    public void testHumanWithDefaultHasNoName() {
        assertFalse(new Human().getName()
                               .isPresent());
    }

    @Test
    public void testHumanWithName() {
        final Human human = new Human(TEST_NAME);

        assertTrue(human.getName()
                        .isPresent());
        assertEquals(TEST_NAME,
                     human.getName()
                          .get());
        assertFalse(human.getAge()
                         .isPresent());
        assertFalse(human.getGender()
                         .isPresent());
    }

    @Test
    public void testHumanWithNameAge() {
        final Human human = new Human(TEST_NAME,
                                      TEST_AGE);

        assertTrue(human.getName()
                        .isPresent());
        assertEquals(TEST_NAME,
                     human.getName()
                          .get());
        assertTrue(human.getAge()
                        .isPresent());
        assertEquals(TEST_AGE,
                     human.getAge()
                          .get()
                          .intValue());
        assertFalse(human.getGender()
                         .isPresent());
    }

    @Test
    public void testHumanWithNameGender() {
        final Human human = new Human(TEST_NAME,
                                      TEST_GENDER);

        assertTrue(human.getName()
                        .isPresent());
        assertEquals(TEST_NAME,
                     human.getName()
                          .get());
        assertTrue(human.getGender()
                        .isPresent());
        assertEquals(TEST_GENDER,
                     human.getGender()
                          .get());
        assertFalse(human.getAge()
                         .isPresent());
    }

    @Test
    public void testHumanWithNameAgeGender() {
        final Human human = new Human(TEST_NAME,
                                      TEST_AGE,
                                      TEST_GENDER);

        assertTrue(human.getName()
                        .isPresent());
        assertEquals(TEST_NAME,
                     human.getName()
                          .get());
        assertTrue(human.getAge()
                        .isPresent());
        assertEquals(TEST_AGE,
                     human.getAge()
                          .get()
                          .intValue());
        assertTrue(human.getGender()
                        .isPresent());
        assertEquals(TEST_GENDER,
                     human.getGender()
                          .get());

    }
}