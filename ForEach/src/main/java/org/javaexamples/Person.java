package org.javaexamples;

public class Person {

    private int personId;
    private String fullName;
    private static int counter;


    // Constructors
    public Person() {
        this.fullName = "John Doe";
        this.personId = ++Person.counter;
    }

    public Person(String fullName) {
        this.fullName = fullName;
        this.personId = ++Person.counter;
    }

    // Getter and setters
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
