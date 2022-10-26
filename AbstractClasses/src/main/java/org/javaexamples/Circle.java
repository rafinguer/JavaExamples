package org.javaexamples;

public class Circle extends Shape {
    // Default constructor. It generates a random name
    public Circle() {
        super("circle_" + (int)(Math.random()*1000));
    }

    public Circle(String circleName) {
        super(circleName);
    }

    // Implementing abstract method
    // For this example, we use a random value
    public double calculateArea() {
        return (double)Math.random()*20;
    }
}
