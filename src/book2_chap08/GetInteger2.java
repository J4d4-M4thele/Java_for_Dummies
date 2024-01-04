/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book2_chap08;

import java.util.*;

/**
 *
 * @author Jada
 */
public class GetInteger2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter an integer: ");
        int i = getAnInt();
        System.out.println("You entered " + i);
    }

    public static int getAnInt() {
        while (!sc.hasNextInt()) {

            sc.nextLine();
            System.out.println("That's not an integer. Try again: ");
        }
        return sc.nextInt();
    }
}
