/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book3_chap02;

import java.text.NumberFormat;

/**
 *
 * @author Jada
 */
public class OrderApp {
    static NumberFormat cf = NumberFormat.getCurrencyInstance();
    public static void main(String[] args) {
        Order ord1 = new Order(5, 5.9);
        ord1.setUnitPrice(45.99);
        ord1.setQtyOrdered(5);
        
        System.out.println("Order 1 Total: " + cf.format(ord1.getOrderTotal()));
    }
}
