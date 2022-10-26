package org.javaexamples;

// An abstract class defines a high level class, in which
// the methods cannot be implemented, due to its generic behavior
// When this class is extended, the children classes must
// to implement their abstract methods
public abstract class Shape {
    private String shapeName;

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    // This method is abstract
    // No implementation is possible
    // Only the children classes can implement it
    public abstract double calculateArea();

    // Getters and Setters
    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }


    @Override
    public String toString() {
        return "Shape{" +
                "shapeName='" + shapeName + '\'' +
                '}';
    }
}
