/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book4_chap04;

import java.util.LinkedList;

/**
 *
 * @author Jada
 */
public class LinkedListApp {

    public static void main(String[] args) {
        LinkedList<String> officers = new LinkedList<String>();
        officers.add("Blake");
        officers.add("Burns");
        officers.add("Houlihan");
        officers.add("Pierce");
        officers.add("McIntyre");
        for (String off : officers) {
            System.out.println(off);
        }
        System.out.println();

        officers.clear();
        officers.addFirst("Blake");
        officers.addFirst("Burns");
        officers.addFirst("Houlihan");
        officers.addFirst("Pierce");
        officers.addFirst("McIntyre");
        for (String off : officers) {
            System.out.println(off);
        }
        System.out.println();
        
        //UPDATING ELEMENTS
        officers.clear();
        officers.add("Blake");
        officers.add("Burns");
        officers.add("Tuttle");
        officers.add("Houlihan");
        officers.add("Pierce");
        officers.add("McIntyre");
        System.out.println(officers);
        
        officers.set(2, "Murdock");
        System.out.println("\nTuttle is replaced: ");
        System.out.println(officers);
        
        //DELETING ELEMENTS
        officers.remove(4);
        System.out.println("\nPierce was cut: ");
        System.out.println(officers);
        
    }
}
