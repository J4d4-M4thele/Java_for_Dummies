/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mathelewriter.payroll;

/**
 *
 * @author Jada Mathele
 * @author www.MatheleWriter.com
 * @version 1.5
 * @since 1.0
 */
public class Employee {

    private String lastName;
    private String firstName;
    private Double salary;

    /**
     * Represents employee's address
     */
    //public Address address;

    /**
     * Creates an employee with the specified name.
     *
     * @param lastName The employee's last name.
     * @param firstName The employee's first name.
     */
    public Employee(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
        //this.address = new Address();
    }

    /**
     * @return the lastName (String data type)
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the firstName (String data type)
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the salary (Double data type)
     */
    public Double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(Double salary) {
        this.salary = salary;
    }
}

//public class Address implements Clonable {
//
//    public String street;
//    public String city;
//    public String state;
//    public String zipCode;
//}
