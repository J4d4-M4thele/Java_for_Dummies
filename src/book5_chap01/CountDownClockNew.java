/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book5_chap01;

/**
 *
 * @author Jada
 */
public class CountDownClockNew implements Runnable {

    int t;

    public CountDownClockNew(int t) {
        this.t = t;
    }

    public void run() {
        System.out.println("T minus " + t);
    }

}
