package org.javaexamples;

public class Aritmethic {
    // private access protects the access from the outside class
    // The access is only provided from inside the class
    private int a;
    private int b;

    // Constructor
    // Constructor by default (without arguments)
    // Initilization of the class attributes
    public Aritmethic() {
        a = 0;
        b = 0;
    }

    // Second constructor. With arguments.
    // With "this", we refer to the own attributes and methods of the class
    public Aritmethic(int a, int b) {
        this.a = a;   // this.a is the a property. a is the method argument
        this.b = b;   // this.b is the b property. b is the method argument
    }

    // Public method. It is accessible from outside the class
    // You can invoke this method from the place in which you instanciate the class
    // You can returns a value, as result of a process or operation
    public int sum() {
        return this.a + this.b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return this.a;
    }

    public int getB() {
        return this.b;
    }
}
