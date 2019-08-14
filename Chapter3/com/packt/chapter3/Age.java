package com.packt.chapter3;

public class Age {
    public double a = 0;

    public void setAge(int year,
                       int month) {
        a = year + (double) month / 12;
    }

    public double getAge() {
        return a;
    }

    public void setAge(double _a) {
        a = _a;
    }
}
