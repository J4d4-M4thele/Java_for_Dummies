/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book5_chap01;

import java.util.concurrent.ScheduledThreadPoolExecutor;

/**
 *
 * @author Jada
 */
public class DoTwoThings {

    ScheduledThreadPoolExecutor pool = new ScheduledThreadPoolExecutor(2);
    CountDownClockNew clock = new CountDownClockNew(20);
    public static void main(String[] args) {
        new DoTwoThings();
    }
    DoTwoThings() {
    //executes clock countdown
    pool.execute(clock);
    pool.execute(clock);
    pool.shutdown();
    }
}
