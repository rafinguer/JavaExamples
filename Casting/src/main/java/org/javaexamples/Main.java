package org.javaexamples;

// Casting allows you to convert between different data types

import org.javaexamples.person.Employee;
import org.javaexamples.person.Person;

public class Main {
    public static void main(String[] args) {
        // Basic casting:
        //    (<target dataType>) <origin dataType>
        System.out.println("Basic casting between native data types");
        int valueInt = 120;
        System.out.println("   - integer: " + valueInt);
        float valueFloat = (float) valueInt;
        System.out.println("   - int to float: " + valueFloat);
        double valueDouble = 3.141592;
        System.out.println("   - double: " + valueDouble);
        valueInt = (int) valueDouble;
        System.out.println("   - double to integer: " + valueInt);

        // String casting
        // Concatenating a String with a number value, automatically is converted to String
        System.out.println("Basic casting with String from other data types");
        String stringValue = "" + valueDouble;
        System.out.println("   - double to string: '" + stringValue + "'");

        // Wrapping casting. Using Autoboxing
        // Each wrapping data have special methods for conversion
        System.out.println("Wrapping casting using Autoboxing/unboxing");
        Double valDouble = 224.567;
        System.out.println("   - double: " + valDouble);
        stringValue = valDouble.toString(); // Casting Double to String
        System.out.println("   - double to string: '" + stringValue + "'");
        valueInt = valDouble.intValue(); // Casting Double to Int
        System.out.println("   - double to integer: " + valueInt);
    }
}