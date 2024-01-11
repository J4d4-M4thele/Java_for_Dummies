/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book4_chap03;

import java.util.ArrayList;

/**
 *
 * @author Jada
 */
public class ArrayListApp {

    public static void main(String[] args) {
        //STRING ARRAYLIST
        ArrayList signs = new ArrayList();
        signs.add("Stop");
        signs.add("No Smoking");
        signs.add("Wet Floor");
        System.out.println(signs);

        signs.add(2, "No minors");
        System.out.println(signs);
        System.out.println();

        //DOUBLE ARRAYLIST
        ArrayList<Double> nums = new ArrayList<Double>();
        nums.add(1.0);
        nums.add(2.0);
        nums.add(3.0);
        nums.add(4.0);
        System.out.println(nums);

        nums.add(3, 3.5);
        System.out.println(nums);
        System.out.println();

        //ACCESSING ELEMENTS
        for (Double num : nums) {
            int i = nums.indexOf(num);
            System.out.println("Item " + i + ": " + num);
        }
        System.out.println();
        
        //DELETING ELEMENTS
        ArrayList<Employee> emps = new ArrayList<Employee>();
        
        Employee emp1 = new Employee("Erykah", "Wright");
        Employee emp2 = new Employee("Jazmine", "Sullivan");
        Employee emp3 = new Employee("Tika", "Sumper");
        
        emps.add(emp1);
        emps.add(emp2);
        emps.add(emp3);
        
        System.out.println(emps);
    }
}

class Employee {

    public String name;
    public String surname;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    
    @Override
    public String toString() {
    return name + " " + surname;
    }
}
