package com.packt.chapter22;

public class ObjectCounter
        implements Runnable {
    public int counter;

    public synchronized void increment() {
        counter++;
        System.out.print(getName() + "+, ");
        pause(100);
    }

    public String getName() {
        return Thread.currentThread()
                     .getName();
    }

    public void pause(int sleepTime) {
        try {
            Thread.sleep(sleepTime);
        }
        catch (InterruptedException ie) {
            System.out.println(getName() + ": Exception: " + ie.getMessage());
        }
    }

    public synchronized void decrement() {
        counter--;
        System.out.print(getName() + "-, ");
        pause(100);
    }

    public void run() {
        while (true) {
            System.out.println("\n" + getName() + ": Counter: " + counter);
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException ie) {
                System.out.println("\n" + getName() + ": Exception: " + ie.getMessage());
                return;
            }
        }
    }
}