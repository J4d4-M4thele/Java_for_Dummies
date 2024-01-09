/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book3_chap05;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Jada
 */
public class TickTock {

    public static void main(String[] args) {
        //event occurs every second (1st parameter)
        //actioListenerInterface is extended (2nd parameter)
        Timer t = new Timer(1000, new Ticker());
        t.start();
        //displaying a message (alert)
        JOptionPane.showMessageDialog(null, "Click OK to exit program");
    }
}
//interface implemented

class Ticker implements ActionListener {

    private boolean tick = true;

    public void actionPerformed(ActionEvent event) {
        if (tick) {
            System.out.println("Tick...");
        } else {
            System.out.println("Tock...");
        }
        //toggles !tick means tick is now false
        tick = !tick;
    }
}
