/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book3_chap04;

import java.io.IOException;

/**
 *
 * @author Jada
 */
public class ProductDB {

    public static Product getProduct() throws ProductDataException {
       try {
            Product p;
            p = new Product(50);
            //p = new Product(-50);

            return p;
        }catch (ProductDataException e)
        {
            throw new ProductDataException("ProductDataException has occurred!");
        }
    }

    public static void main(String[] args) {
        try {
            getProduct();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class Product {

    public Product(double price) throws ProductDataException {
        if (price < 0) {
            throw new ProductDataException("");
        }
    }
}
