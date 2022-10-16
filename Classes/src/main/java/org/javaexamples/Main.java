package org.javaexamples;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.firstName = "Rafael";
        person1.lastName = "Hernamperez";
        person1.email = "rafael.hernamperez@email.com";
        person1.age = 50;

        System.out.println("person1: " + person1);
        person1.showPersonInfo();
    }
}