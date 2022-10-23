package org.javaexamples;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Rafael Hernamperez");
        System.out.println("person1: " + person1.toString());

        Person person2 = new Person();
        person2.setFullName("Eduardo Fernandez");
        System.out.println("person2: " + person2.toString());
    }
}