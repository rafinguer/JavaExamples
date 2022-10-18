package org.javaexamples;

public class Main {

    public static void main(String[] args) {
        // On an encapsulated class, their properties are protected
        // You only can access to them using public methods
        Person person = new Person();
        person.setFullName("Rafael Hernamperez");
        person.setEmail("rafael.hernamperez@email.com");
        person.setAge(50);
        System.out.println("Full name: " + person.getFullName());
        System.out.println("Email: " + person.getEmail());
        System.out.println("Age: " + person.getAge());

        // Using the customized constructor in order to initialize directly the properties
        Person otherPerson = new Person("Eduardo Fernandez", "edu.fernandez@email.com", 52);

        // Showing the values with toString() method
        System.out.println("otherPerson: " + otherPerson.toString());

        // Changing email
        person.setEmail("rhernamperez@email.com");
        System.out.println("person: " + person.toString());
    }
}