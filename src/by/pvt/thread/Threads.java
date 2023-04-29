package by.pvt.thread;

import java.util.ArrayList;
import java.util.List;

public class Threads extends Thread {
    public Threads(String name) {
        super(name);
    }

    public void run() {
        int[] number = new int[10];
        int max = 0;
        for (int i = 0; i < number.length; i++) {
            number[i] = (int) (Math.random()*100);
            if(number[i] > max) {
                max = number[i];
            }
        }
        System.out.println(Thread.currentThread().getName() + " " + max);
    }
}
