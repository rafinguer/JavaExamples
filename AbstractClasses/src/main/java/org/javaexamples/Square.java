package org.javaexamples;

public class Square extends Shape{

    // Default constructor. It generates a random name
    public Square() {
        super("square_" + (int)(Math.random()*1000));
    }

    public Square(String squareName) {
        super(squareName);
    }

    // Implementing abstract method
    // For this example, we use a randdm value
    public double calculateArea() {
        return (double)Math.random()*100;
    }
}
