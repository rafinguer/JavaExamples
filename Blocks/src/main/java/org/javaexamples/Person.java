package org.javaexamples;

public class Person {

    private int personId;
    private String fullName;
    private static int counter;

    // The first block is executed the first time in which the class is instantiated
    // It's used to apply changes on static members
    static {
        System.out.println("Static block");
        ++Person.counter;
    }

    // The second block is executed every time the class is instantiated (initialized)
    // It's used to apply changes on non static members
    {
        System.out.println("Non static block");
        this.personId = ++Person.counter;
    }

    // Constructors
    public Person() {
        System.out.println("Default constructor block");
    }

    public Person(String fullName) {
        System.out.println("Second constructor block");
        this.fullName = fullName;
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
