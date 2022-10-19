package org.javaexamples;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println(person1.toString());

        Person person2 = new Person();
        person2.setFullName("Rafael Hernamperez");
        person2.setEmail("rhernamperez@mail.com");
        person2.setAge(50);
        System.out.println(person2.toString());

        Person person3 = new Person("Eduardo Fernandez", "edu.fdez@email.com", 51);
        System.out.println(person3.toString());

        System.out.println("Last ID: " + Person.getLastId());
    }
}