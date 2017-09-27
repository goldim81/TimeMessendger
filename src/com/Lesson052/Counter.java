package com.Lesson052;

public class Counter implements Runnable{
    private int count;

    public Counter(int counter) {
        this.count = counter;

    }

    public int getCount() {
        return count;
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (this) {
                count++;
                this.notifyAll();
            }

        }
    }
}
