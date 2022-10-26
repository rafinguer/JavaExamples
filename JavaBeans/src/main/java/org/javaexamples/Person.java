package org.javaexamples;

import java.io.Serializable;

// Rules for a Java Bean:
//    - Must implement Serializable interface
//    - Must contains, at least, and empty constructor
//    - Properties must be private
//    - Define getters and setters for each property
// Note: A serializable object can be sent between different systems
public class Person implements Serializable {
    private String firstName;
    private String lastName;
    private String email;

    // Minimum constructor
    public Person() {
    }

    public Person(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    // Getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
