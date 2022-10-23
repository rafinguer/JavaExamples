package org.javaexamples;

import org.javaexamples.person.*;

// Importing Java classes from their corresponding packages
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

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

        if (customer instanceof Customer) {
            System.out.println("customer is instance of Customer");
        }

        if (customer instanceof Person) {
            System.out.println("customer is instance of Person");
        }

        if (customer instanceof Object) {
            System.out.println("customer is instance of Object");
        }
    }
}