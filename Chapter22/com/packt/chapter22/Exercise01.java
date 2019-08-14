package com.packt.chapter22;

import static java.lang.System.currentTimeMillis;

public class Exercise01 {

    public static void main(String[] args)
            throws
            InterruptedException {
        int simulationSize = 100;
        ObjectCounter _threadA = new ObjectCounter();
        Thread threadA = new Thread(_threadA);
        threadA.setName("A");
        ObjectIncrement _threadB = new ObjectIncrement(_threadA,
                                                       5,
                                                       simulationSize);
        Thread threadB = new Thread(_threadB);
        threadB.setName("B");
        ObjectDecrement _threadC = new ObjectDecrement(_threadA,
                                                       10,
                                                       simulationSize);
        Thread threadC = new Thread(_threadC);
        threadC.setName("C");

        long startTime = currentTimeMillis();
        threadA.start();
        threadB.start();
        threadC.start();

        threadB.join();
        threadC.join();
        threadA.interrupt();
        long endTime = currentTimeMillis();

        System.out.println("exec time: " + (endTime - startTime));
    }
}
