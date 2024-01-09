/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book3_chap02;

/**
 *
 * @author Jada
 */
public class ActorApp {

    public static void main(String[] args) {
        Actor actor1 = new Actor("Arnold", "Schwarzenegger", true);
        Actor actor2 = new Actor("Keanu", "Reeves");
        Actor actor3 = new Actor("Brad", "Pitt", false);
        
        System.out.println(actor1.getFirstName() + " " + actor1.getLastName() + " is a " + (actor1.isGoodActor() ? "good" : "bad") + " actor");
        System.out.println(actor2.getFirstName() + " " + actor2.getLastName() + " is a " + (actor2.isGoodActor() ? "good" : "bad") + " actor");
        System.out.println(actor3.getFirstName() + " " + actor3.getLastName() + " is a " + (actor3.isGoodActor() ? "good" : "bad") + " actor");
        
        System.out.println(actor1.toString());
    }
}
