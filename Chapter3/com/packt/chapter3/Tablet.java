package com.packt.chapter3;

public class Tablet
        extends Computer {
    // variables
    private double screenSize;  // in inches

    double getScreenSize() {
        return screenSize;
    }

    // methods
    void setScreenSize(double _screenSize) {
        screenSize = _screenSize;
    }
}
