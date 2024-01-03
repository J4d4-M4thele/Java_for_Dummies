/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book2_chap05;

/**
 *
 * @author Jada
 */
public class Dodecaphobia {
    public static void main(String[] args) {
        int num = 0;
        while(num < 20) {
        num += 2;
        if(num == 12)
            continue;
            System.out.println(num + " ");
        }
        System.out.println();
    }
}
