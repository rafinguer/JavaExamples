package org.javaexamples;

// An interface defines the behavior of any class that implements it
// In interface declares, but not implements, the methods
// After, any class that implements the interface, must implements all its methods
// For this example, we simulate a Data Object in database
// IDataAccess is the interface and Contact implements its methods

public class Main {
    public static void main(String[] args) {
        // In this example we use fake data
        // In this case we use a String instead of a Data Object
        Contact contact = new Contact("Rafael Hernamperez", "rhernamperez@email.com");

        contact.createData();
        contact.updateData();
        contact.deleteData();

        String[] data = contact.selectData("contact='fake'");
        System.out.println("Getting data array:");

        for(String i: data) {
            System.out.println("   " + i);
        }
    }
}