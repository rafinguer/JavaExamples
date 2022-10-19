package org.javaexamples;

public class Person {
    private int id;
    private String fullName;
    private String email;
    private int age;

    // A static member is own for the Class
    // A static member is shared by the instances of the class
    // The static member is unique and common for all the instances
    private static int counter;

    // Constructors
    public Person() {
        this.fullName = "John Doe";
        this.email = "john.doe@email.com";
        this.age = 0;

        // static members are owned by the class, not by the instance
        // for this reason, you need to specify the name of the class
        // to access the static members
        this.id = Person.counter++;  // first increment counter and then assign to id
    }

    public Person(String fullName, String email, int age) {
        this.fullName = fullName;
        this.email = email;
        this.age = age;

        // static members are owned by the class, not by the instance
        // for this reason, you need to specify the name of the class
        // to access the static members
        this.id = Person.counter++;  // first increment counter and then assign to id
    }

    public static int getLastId() {
        return Person.counter;
    }


    // Getters and Setters
    // id is read only
    public int getId() {
        return id;
    }

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
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "@Person { id: " + this.id +
                ", fullName: '" + this.fullName +
                "', email: '" + this.email +
                "' age: " + this.age +
                " } - counter: " + Person.counter;
    }
}
