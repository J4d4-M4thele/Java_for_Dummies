/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book3_chap06;

/**
 *
 * @author Jada
 */
public class TestEquality {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Martinez", "Anthony");
        //Employee emp2 = new Employee("Martinez", "Anthony");
        Employee emp2 = new Employee("Boyega", "John");
        if (emp1.equals(emp2)) {
            System.out.println("These employees are the same.");
        } else {
            System.out.println("These are different employees.");
        }
    }
}

class Employee {

    private String lastName;
    private String firstName;

    public Employee(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public boolean equals(Object obj) {
        //obj equal to itself
        if (this == obj) {
            return true;
        }
        //no obj equals null
        if (this == null) {
            return false;
        }
        //objs of diff types are never equal
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        //cast to employee 
        Employee emp = (Employee) obj;
        return this.lastName.equals(emp.getLastName())
                && this.firstName.equals(emp.getFirstName());
    }

}
