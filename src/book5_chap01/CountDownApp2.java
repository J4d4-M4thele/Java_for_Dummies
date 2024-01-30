/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book5_chap01;

import java.util.ArrayList;

/**
 *
 * @author Jada
 */
public class CountDownApp2 {

    public static void main(String[] args) {
        CountDownClock clock = new CountDownClock(20);

    }
}

interface TimeMonitor {

    int getTime();
}

class CountDownClock extends Thread
        implements TimeMonitor {

    private int t;

    public CountDownClock(int start) {
        this.t = start;
    }

    public void run() {
        for (; t >= 0; t--) {
            System.out.println("T minus" + t);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                {}
        }
    }
    public int getTime() {
        return t;
    }
}



}

}

class LaunchEvent implements Runnable {

    private int start;
    private String message;
    TimeMonitor tm;

    public LaunchEvent(int start, String message,
            TimeMonitor monitor) {
        this.start = start;
        this.message = message;
        this.tm = monitor;
    }

    public void run() {
        boolean eventDone = false;
        while (!eventDone) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
            if (tm.getTime() <= start) {
                System.out.println(this.message);
                eventDone = true;
            }
        }
    }
}
