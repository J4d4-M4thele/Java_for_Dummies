/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book5_chap01;

/**
 *
 * @author Jada
 */
public class LaunchEvent2 implements Runnable {

    private int start;
    private String message;
    TimeMonitor tm;

    public LaunchEvent2(int start, String message,
            TimeMonitor monitor) {
        this.start = start;
        this.message = message;
        this.tm = monitor;
    }

    public void run() {
        boolean eventDone = false;
        boolean aborted = false;
        while (!eventDone) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                aborted = true;
            }
            if (tm.getTime() <= start) {
                System.out.println(this.message);
                eventDone = true;
                System.out.println("ABORT!!!!");
            }
            if (Thread.interrupted()) {
                aborted = true;
            }
            if (aborted) {
                System.out.println(
                        "Aborting " + message);
                break;
            }
        }
    }
}
