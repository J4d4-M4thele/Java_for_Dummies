/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book5_chap01;

/**
 *
 * @author Jada
 */
public class LaunchEvent implements Runnable {

    private int start;
    private String message;

    public LaunchEvent(int start, String message) {
        this.start = start;
        this.message = message;
    }

    public void run() {
        try {
            Thread.sleep(20000 - (start * 1000));
        } catch (InterruptedException e) {
        }
        System.out.println(message);
    }
}
