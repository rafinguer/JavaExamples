package org.javaexamples;

public class Rectangle extends Shape {
    // Default constructor. It generates a random name
    public Rectangle() {
        super("rectangle_" + (int)(Math.random()*1000));
    }

    public Rectangle(String rectangleName) {
        super(rectangleName);
    }

    // Implementing abstract method
    // For this example, we use a random value
    public double calculateArea() {
        return (double) (Math.random()*100)+500;
    }
}
