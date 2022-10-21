package org.javaexamples;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Person instance
        Person person = new Person("Rafael Hernamperez", "1st Oak Street", 'M', 51);
        System.out.println("Person: " + person.toString());

        // Employee inheritances from Person
        // It has the properties and methods from Person
        // and its own methods and properties
        Employee employee = new Employee();
        employee.setFullName("Eduardo Fernandez");
        employee.setAddress("9nd Baker Street");
        employee.setGenre('M');
        employee.setAge(52);
        employee.setEmployeeId(1);
        employee.setSalary(42500.86);
        System.out.println("Employee: " + employee.getFullName() + "-" + employee.toString());

        // Customer inheritances from Person
        // It has the properties and methods from Person
        // and its own methods and properties
        Customer customer = new Customer();
        customer.setFullName("Clemen del Bosque");
        customer.setAddress("2nd Orange Avenue");
        customer.setGenre('F');
        customer.setAge(49);
        customer.setCustomerId(1);
        try {
            Date registryId = new SimpleDateFormat("yyyy-MM-dd").parse("2022-10-21");
            customer.setRegistryId(registryId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        customer.setVip(true);
        System.out.println("Customer: " + customer.getFullName() + "-" + customer.toString());
    }
}