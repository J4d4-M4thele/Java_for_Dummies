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
        CountDownClock2 clock = new CountDownClock2(20);
        ArrayList<Runnable> events = new ArrayList<Runnable>();
        events.add(new LaunchEvent2(16,
                "Flood the pad!", clock));
        events.add(new LaunchEvent2(6,
                "Start engines!", clock));
        events.add(new LaunchEvent2(0,
                "Liftoff!", clock));
        clock.start();
        for (Runnable e : events) {
            new Thread(e).start();
        }
    }
}
