/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book3_chap02;

/**
 *
 * @author Jada
 */
public class Order {

    private double unitPrice;
    private int qtyOrdered;

    //constructors
    public Order(int u, double p) {
        qtyOrdered = u;
        unitPrice = p;
    }

    public Order(int u) {
        qtyOrdered = u;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQtyOrdered() {
        return qtyOrdered;
    }

    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }

    public double getOrderTotal() {
        return unitPrice * qtyOrdered;
    }

}
