package org.javaexamples;

public class Main {
    public static void main(String[] args) {
        Aritmethic aritmethic1 = new Aritmethic();  // Objects are stored in the Heap memory
        // aritmethic1.a = 24;  // a attribute is private. You cannot access to it
        // aritmethic1.b = 45;  // b attribute is private. You cannot access to it
        aritmethic1.setA(24);  // setA is a public method. Use it to assign a value to a
        aritmethic1.setB(45);  // setA is abpublic method. Use it to assign a value to b
        int result = aritmethic1.sum();   // local variables are stored in the Stack memory

        System.out.println("Sum aritmethic1: " + result);

        Aritmethic aritmethic2 = new Aritmethic(42, 33);
        System.out.println("Sum aritmethic2: " + aritmethic2.sum());

        // Assigning null to a instance variable, you will promote
        // the object instance to the garbage collector
        aritmethic1 = null;
        aritmethic2 = null;

        System.gc();  // When possible, the garbage collector will be cleaned
    }
}