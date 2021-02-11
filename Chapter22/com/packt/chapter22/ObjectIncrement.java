package com.packt.chapter22;

public class ObjectIncrement
        implements Runnable {
    ObjectCounter threadToCount;
    int objectFreq;
    int simulationSize;

    ObjectIncrement(ObjectCounter _threadToCount,
                    int _objectFreq,
                    int _simulationSize) {
        threadToCount = _threadToCount;
        objectFreq = _objectFreq;
        simulationSize = _simulationSize;
    }

    public void run() {
        String name = Thread.currentThread()
                            .getName();

        System.out.println(name + ": counting in thread");

        for (int i = 0;
             i < simulationSize;
             i++) {
            threadToCount.increment();

            try {
                Thread.sleep(objectFreq);
            }
            catch (InterruptedException ie) {
                System.out.println(name + ": Exception: " + ie.getMessage());
            }
        }
    }
}
