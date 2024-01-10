/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book3_chap07;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Jada
 */
public class TickTockStatic {
    //static fields
    private static String tickMsg = "Tick...";
    private static String tockMsg = "Tock...";

    public static void main(String[] args) {
        TickTockStatic t = new TickTockStatic();
        t.go();
    }

    private void go() {
        Timer t = new Timer(1000, new Ticker());
        t.start();
        //display message
        JOptionPane.showMessageDialog(null, "Click OK to exit this program.");
        System.exit(0);
    }

    //***********STATIC INNER CLASS***************
    static class Ticker implements ActionListener {

        private boolean tick = true;

        public void actionPerformed(ActionEvent event) {
            if (tick) {
                System.out.println(tickMsg);
            } else {
                System.out.println(tockMsg);
            }
            //toggle
            tick = !tick;
        }
    }
}
