/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book3_chap02;

import java.util.Scanner;

/**
 *
 * @author Jada
 */
public class Initializer {
    private Scanner sc = new Scanner(System.in);
    //initializer
    public int x;
    {
        System.out.println("In static initializer.");
        System.out.print("Enter the starting value for x: ");
        x = sc.nextInt();
        System.out.println("You entered " + x);
    }
    //constructor
    public Initializer() {
        System.out.println("In constructor now.");
    }
}
