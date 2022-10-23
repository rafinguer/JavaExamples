package org.javaexamples;

public class Main {
    public static void main(String[] args) {
        // Autoboxing. Using wrapping classes from native data types
        // You can use the Object as a native data type, but you also
        // can use special methods.
        //    int - Integer
        //    long - Long
        //    float -  Float
        //    double - Double
        //    boolean - Boolean
        Integer age = 50;
        age++;
        System.out.println("Age (wrapped): " + age + " years old");
        System.out.println("Converted to float: " + age.floatValue());

        // Unboxing. Using native data types from a wrapped class
        int myAge = age;  // Assigning wrapped class to a native type
        myAge += 5;
        System.out.println("myAge (native): " + myAge + " years old");
    }
}