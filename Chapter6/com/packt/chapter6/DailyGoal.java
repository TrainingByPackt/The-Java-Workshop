package com.packt.chapter6;

public class DailyGoal {
    int dailyGoal = 10000;

    public boolean hasMetGoal(Steps steps) {
        if (steps.getSteps() >= dailyGoal) {
            return true;
        }

        return false;
    }
}
