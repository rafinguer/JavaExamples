package org.javaexamples;

// Encapsulation in Java is a process of wrapping code and data together into a single unit
// To do this, declare the properties as private access
// No one, outside this class, can access directly to the data
// Only the own methods from this class can access to their properties,
// in a controlled way. Make public those methods that you want to be accessed from outside the class
public class Person {
    private String fullName;
    private String email;
    private int age;

    // Default constructor
    public Person() {
        this.fullName = "";
        this.email = "";
        this.age = 0;
    }

    // Customized constructor
    public Person(String fullName, String email, int age) {
        this.fullName = fullName;
        this.email = email;
        this.age = age;
    }

    // Getters and setters for each property
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Overriding toString() method
    public String toString() {
        return "@Person: { fullName: " + this.fullName +
                ", email: " + this.email +
                ", age: " + this.age + " }";
    }
}
