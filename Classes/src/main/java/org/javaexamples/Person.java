package org.javaexamples;

public class Person {
    String firstName;
    String lastName;
    String email;
    int age;

    // public methods are accessible from out this class
    // They can be called from the places in which we instanciate this class
    public void showPersonInfo() {
        System.out.println("Name: " + this.firstName + " " + lastName);
        System.out.println("Email: " + this.email);
        System.out.println("Age: " + this.age + " years old");
    }
}
