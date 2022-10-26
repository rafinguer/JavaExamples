package org.javaexamples;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Rafael", "Hernamperez", "rhernamperez@email.com");
        System.out.println("First name: " + person.getFirstName());
        System.out.println("Last name: " + person.getLastName());
        System.out.println("Email: " + person.getEmail());
    }
}