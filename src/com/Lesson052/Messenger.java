package com.Lesson052;

public class Messenger implements Runnable {
    Counter counter;
    byte timer;


    public Messenger(Counter c, byte t) {
        this.counter = c;
        this.timer = t;
    }

    @Override
    public void run() {
        int val = 0;
        while (true) {
            synchronized (counter) {
                try {
                    counter.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                val = counter.getCount();
            }
            if (val % timer == 0) {
                System.out.println(val);
            }
        }
    }
}
