package org.javaexamples;

// This example is the same that Inheritance and packages,
// but we use the final feature in variables, methods and classes
import org.javaexamples.person.*;

// Importing Java classes from their corresponding packages
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    // A final variable cannot be changed after its definition (like a constant)
    private static final int MINIMUM_AGE = 18;

    public static void main(String[] args) {
        // MINIMUM_AGE = 24;   // This will provoke an error. Its value cannot be modified

        // Person instance
        // person object is final, and the memory reference is immutable, but its contents can be modified
        final Person person = new Person("Rafael Hernamperez", "1st Oak Street", 'M', 51);
        System.out.println("Person: " + person.toString() + " - Reference: " + System.identityHashCode(person));

        // We can modify the content of person object, but not its memory reference
        person.setAge(56);
        System.out.println("Person: " + person.toString() + " - Reference: " + System.identityHashCode(person));

        // We cannot reassign a new object
        // This will provoke an error, because a new object will be created at a new memory address
        // person = new Person();


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

        // ExternalEmployee inheritances from Person
        // It has the properties and methods from Person
        // and its own methods and properties
        // ExternalEmployee don't inheritance from Employee, because this is a final class
        ExternalEmployee externalEmployee = new ExternalEmployee();
        externalEmployee.setFullName("Nerea Hernandez");
        externalEmployee.setAddress("11th Park Avenue");
        externalEmployee.setGenre('F');
        externalEmployee.setAge(32);
        externalEmployee.setExternalEmployeeId(10);
        externalEmployee.setSalary(28950.95);
        System.out.println("External employee: " + externalEmployee.getFullName() + "-" + externalEmployee.toString());

        // Customer inheritances from Person
        // It has the properties and methods from Person
        // and its own methods and properties
        Customer customer = new Customer();
        customer.setFullName("Clemen del Bosque");
        customer.setAddress("2nd Orange Avenue");
        customer.setGenre('F');
        customer.setAge(MINIMUM_AGE);
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