package com.packt.chapter6;

import org.junit.Before;
import org.junit.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.*;

public class WeeklyStepsTest {

    private static final List<Steps> TEST_DAILY_STEPS = new ArrayList<>();
    private static final DailyGoal TEST_DAILY_GOAL = new DailyGoal();
    private static final int TEST_DAILY_GOAL_VALUE = 1000;
    private static final LocalDate TEST_TODAY = LocalDate.now();
    private static final LocalDate TEST_YESTERDAY = TEST_TODAY.minus(Period.ofDays(1));

    private WeeklySteps weeklySteps;

    @Before
    public void setUp()
            throws
            Exception {
        weeklySteps = new WeeklySteps();
        weeklySteps.setDailyGoal(TEST_DAILY_GOAL);
    }

    @Test
    public void testDailySteps() {
        weeklySteps.setDailySteps(TEST_DAILY_STEPS);
        assertEquals(TEST_DAILY_STEPS,
                     weeklySteps.getDailySteps());
    }

    @Test
    public void testGetDailyGoal() {
        assertSame(TEST_DAILY_GOAL,
                   weeklySteps.getDailyGoal());
    }

    @Test
    public void testFormatWhenGoalIsReached() {
        weeklySteps.dailyGoal.dailyGoal = TEST_DAILY_GOAL_VALUE;
        weeklySteps.addDailySteps(TEST_DAILY_GOAL_VALUE,
                                  TEST_TODAY);

        final String result = weeklySteps.format();

        assertTrue(result.indexOf("YAY!") != -1);
    }

    @Test
    public void testFormatWhenGoalIsNotReached() {
        weeklySteps.dailyGoal.dailyGoal = TEST_DAILY_GOAL_VALUE;
        weeklySteps.addDailySteps(TEST_DAILY_GOAL_VALUE - 1,
                                  TEST_TODAY);

        final String result = weeklySteps.format();

        assertTrue(result.indexOf("YAY!") == -1);
    }

    @Test
    public void testTotalSteps() {
        weeklySteps.addDailySteps(TEST_DAILY_GOAL_VALUE,
                                  TEST_TODAY);
        weeklySteps.addDailySteps(TEST_DAILY_GOAL_VALUE,
                                  TEST_TODAY);
        weeklySteps.addDailySteps(TEST_DAILY_GOAL_VALUE,
                                  TEST_TODAY);

        final int result = weeklySteps.getTotalSteps();

        assertEquals(3 * TEST_DAILY_GOAL_VALUE,
                     weeklySteps.getTotalSteps());
    }

    @Test
    public void testBestDay() {
        weeklySteps.addDailySteps(TEST_DAILY_GOAL_VALUE + 1,
                                  TEST_YESTERDAY);
        weeklySteps.addDailySteps(TEST_DAILY_GOAL_VALUE,
                                  TEST_TODAY);

        final DayOfWeek result = weeklySteps.bestDay();

        assertEquals(TEST_YESTERDAY.getDayOfWeek(),
                     result);
    }

    @Test
    public void addDailySteps() {
        int count = weeklySteps.getDailySteps()
                               .size();

        weeklySteps.addDailySteps(TEST_DAILY_GOAL_VALUE,
                                  TEST_TODAY);

        assertEquals(count + 1,
                     weeklySteps.getDailySteps()
                                .size());
        assertEquals(TEST_DAILY_GOAL_VALUE,
                     weeklySteps.getDailySteps()
                                .get(count)
                                .getSteps());
        assertEquals(TEST_TODAY,
                     weeklySteps.getDailySteps()
                                .get(count)
                                .getDate());
    }
}