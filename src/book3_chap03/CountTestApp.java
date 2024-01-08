/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book3_chap03;

/**
 *
 * @author Jada
 */
public class CountTestApp {

    public static void main(String[] args) {
        printCount();
        for (int i = 0; i < 10; i++) {
            //instantiating object
            CountTest c1 = new CountTest();
            printCount();
        }
    }

    private static void printCount() {
        System.out.println("There are now "
                + CountTest.getInstanceCount() + " instances of the CountTest class.");
    }
}

class CountTest {

    private static int instanceCount = 0;
    //constructor
    public CountTest() {
        instanceCount++;
    }
    //method
    public static int getInstanceCount() {
        return instanceCount;
    }
}
