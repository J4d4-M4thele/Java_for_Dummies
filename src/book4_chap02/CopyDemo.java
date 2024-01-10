/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book4_chap02;

import java.util.Arrays;

/**
 *
 * @author Jada
 */
public class CopyDemo {

    public static void main(String[] args) {
        int arrayOrig[] = {42, 55, 21};
        int arrNew[] = Arrays.copyOf(arrayOrig, 3);
        printIntArray(arrNew);
    }

    static void printIntArray(int arrNew[]) {
        for (int i : arrNew) {
            System.out.println(i);
            System.out.println(' ');
        }
        System.out.println();
    }
}
