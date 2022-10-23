package org.javaexamples;

public class Main {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Orange","Pineapple", "Peach", "Banana"};

        System.out.println("Fruits list using a normal for loop");
        for (int i=0; i<fruits.length; i++) {
            System.out.println("   - " + fruits[i]);
        }

        System.out.println("Fruits list using a normal for each loop");
        for (String fruit: fruits) {
            System.out.println("   - " + fruit);
        }

        Person[] persons = {
                new Person("Rafael Hernamperez"),
                new Person("Eduardo Fernandez"),
                new Person("Clemen del Bosque")
        };

        System.out.println("Persons list using a normal for each loop");
        for (Person person: persons) {
            System.out.println("   - " + person.toString());
        }
    }
}