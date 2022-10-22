package org.javaexamples;

public class Person {
    private String fullName;
    private String address;
    private char genre;
    private int age;

    // Constructor by default
    public Person() {
        this.fullName = "John Doe";
        this.address = "My address";
        this.genre = 'M';
        this.age = 0;
    }

    // Constructor overloading
    // Constructor with parameters
    public Person(String fullName, String address, char genre, int age) {
        this.fullName = fullName;
        this.address = address;
        this.genre = genre;
        this.age = age;
    }

    // Getters and Setters
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public char getGenre() {
        return genre;
    }

    public void setGenre(char genre) {
        this.genre = genre;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method toString() overloaded
    // You override the parent class (super()) toString() method
    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", genre=" + genre +
                ", age=" + age +
                '}';
    }
}
