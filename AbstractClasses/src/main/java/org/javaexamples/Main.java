package org.javaexamples;

// Abstract classes demo
// Shape is the parent and abstract class. It defines an abstract method: calculateArea()
// Square, Rectangle and Circle classes are children classes from Shape,
// and all of them must implement the calculateArea() method
public class Main {
    public static void main(String[] args) {
        Square square1 = new Square();
        System.out.println(square1.getShapeName() + " - area: " + square1.calculateArea());

        Square square2 = new Square("square2");
        System.out.println(square2.getShapeName() + " - area: " + square2.calculateArea());

        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1.getShapeName() + " - area: " + rectangle1.calculateArea());

        Circle circle1 = new Circle();
        System.out.println(circle1.getShapeName() + " - area: " + circle1.calculateArea());
    }
}