package com.Lesson052;

public class Main {
    static Integer count = 0;
    public static void main(String[] args) {
        Integer count = 0;

        Counter counter = new Counter(count);
        Messenger messenger = new Messenger(counter, (byte) 5);
        Messenger messenger2 = new Messenger(counter, (byte) 7);

        new Thread(counter).start();
        new Thread(messenger).start();
        new Thread(messenger2).start();
    }
}
