/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book2_chap05;

import java.util.Scanner;

/**
 *
 * @author Jada
 */
public class NumberPhobia {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int num = 2;
        String input;
        while (true) {
            System.out.println(num + " ");
            System.out.println("Do you want to keep counting? (Y or N)");
            input = sc.next();
            if (input.equalsIgnoreCase("N")) {
                break;
            }
            num += 2;
        }
        System.out.println("\nWhew! That was close.\n");
    }
}
