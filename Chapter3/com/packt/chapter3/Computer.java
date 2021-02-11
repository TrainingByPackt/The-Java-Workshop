package com.packt.chapter3;

public class Computer {
    // variables
    double cpuSpeed;  // in GHz

    // constructor
    Computer() {
        cpuSpeed = 0;
    }

    double getCpuSpeed() {
        return cpuSpeed;
    }

    // methods
    void setCpuSpeed(double _cpuSpeed) {
        cpuSpeed = _cpuSpeed;
    }
}
