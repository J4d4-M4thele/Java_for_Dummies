/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book2_chap04;

import java.util.Scanner;

/**
 *
 * @author Jada
 */
public class Decisions {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int x;
        System.out.println("Please enter the amount of apple(s) you have: ");
        x = sc.nextInt();
        
        String msg = "You have " + x + " apple" + ((x > 1) ? "s." : ".");
        System.out.println(msg);
        
        String ans = "Yes";
        //EQUALS
        if(ans.equals("Yes")) {
            System.out.println("The answer is yes. Done properly.");
        }
        //EQUALSIGNORECASE
        if(ans.equalsIgnoreCase("Yes")) {
            System.out.println("The answer is yes. Done properly.");
        }
    }
}
