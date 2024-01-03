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
public class NumberPhobia2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int num = 2;
        String input = "Y";
        while (input.equalsIgnoreCase("Y")) {
            System.out.println(num + " ");
            System.out.print("Do you want to keep counting?"
                    + " (Y or N)");
            input = sc.next();
            num += 2;
        }
        System.out.println("\nWhew! That was close.\n");
    }
}
