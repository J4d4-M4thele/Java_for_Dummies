/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book2_chap03;

import java.text.NumberFormat;

/**
 *
 * @author Jada
 */
public class NumberFormatClassApp {

    static NumberFormat cf = NumberFormat.getCurrencyInstance();

    public static void main(String[] args) {
        printMyAllowance();
        printCostPaintBallGun();
    }

    public static void printMyAllowance() {
        double myAllowance = 5.00;
        cf = NumberFormat.getCurrencyInstance();
        System.out.println("My Allowance is " + cf.format(myAllowance));
    }

    public static void printCostPaintBallGun() {
        double costPaintBallGun = 60.05;
        cf = NumberFormat.getCurrencyInstance();
        System.out.println("The paintball gun costs  " + cf.format(costPaintBallGun));
    }
}
