/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book2_chap02;

/**
 *
 * @author Jada
 */
public class EnumTest {
    public enum CardSuit {HEARTS, SPADES, CLUBS, DIAMONDS};
    
    public static void main(String[] args) {
        CardSuit suit;
        //choosing value
        suit = CardSuit.DIAMONDS;
        System.out.println("The suit is " + suit);
    }
}
