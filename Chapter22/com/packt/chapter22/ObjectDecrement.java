package com.packt.chapter22;

public class ObjectDecrement
        implements Runnable {
    ObjectCounter threadToDiscount;
    int objectFreq;
    int simulationSize;

    ObjectDecrement(ObjectCounter _threadToCount,
                    int _objectFreq,
                    int _simulationSize) {
        threadToDiscount = _threadToCount;
        objectFreq = _objectFreq;
        simulationSize = _simulationSize;
    }

    public void run() {
        String name = Thread.currentThread()
                            .getName();

        System.out.println(name + ": discounting in thread");

        // discount only if there is something in
        while (simulationSize > 0) {
            if (threadToDiscount.counter > 0) {
                threadToDiscount.decrement();

                try {
                    Thread.sleep(objectFreq);
                }
                catch (InterruptedException ie) {
                    System.out.println(name + ": Exception: " + ie.getMessage());
                }

                simulationSize--;
            }
        }
    }
}
