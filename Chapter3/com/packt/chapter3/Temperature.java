package com.packt.chapter3;

public class Temperature {
    public double t = 25;

    public double getCelsius() {
        return t;
    }

    final public double getFahrenheit() {
        return t * 9 / 5 + 32;
    }
}
