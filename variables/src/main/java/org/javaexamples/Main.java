package org.javaexamples;

import java.sql.SQLOutput;
import java.util.Scanner;

// Naming variables convention.
//    var miVariable = 10;
//    var _miVariable = 10;
//    var $miVariable = 10;
public class Main {
    public static void main(String[] args) {
        System.out.println("Variables example");
        System.out.println("-----------------");

        integerDemo();
        floatDemo();
        stringDemo();
        inferenceDemo();
        concatenateDemo();
        scannerDemo();
    }

    // Example code for integer Variables
    private static void integerDemo() {
        int integerVar = 4;
        System.out.println("integerVar = " + integerVar);

        // Changing value of the variable
        integerVar = 12;
        System.out.println("integerVar = " + integerVar);
    }

    // Example code for float Variables
    private static void floatDemo() {
        double floatVar = 3.25;
        System.out.println("floatVar = " + floatVar);

        // Changing value of the variable
        floatVar = 6.95;
        System.out.println("floatVar = " + floatVar);
    }

    // Example code for String variables
    private static void stringDemo() {
        String stringVar = "Hello, my friend";
        System.out.println("stringVar: " + stringVar);

        // Change value of the variable
        stringVar = "Bye bye...";
        System.out.println("stringVar: " + stringVar);
    }

    // Example code for inference into variables
    private static void inferenceDemo() {
        var number = 10;   // Automatically inferences to int
        var pi = 3.141592;  // Automatically inferences to double (float)
        var name = "Rafael";   // Automatically inferences to String
        System.out.println("number: " + number);
        System.out.println("pi: " + pi);
        System.out.println("name: " + name);
    }

    // Example code for concatenating strings
    private static void concatenateDemo() {
        String firstName = "Rafael";
        String lastName = "Hernamperez";

        // Concatenating two String variables and a space (between both)
        String fullName = firstName + " " + lastName;
        System.out.println("Full name: " + fullName);

        // Concatenating a String and a number. Automatically, number is converted to String
        String salary = "Salary: " + 44000.34 + "$";
        System.out.println("Salary: " + salary);
    }

    // Example code for Scanner class
    // This class accepts data via keyboard
    private static void scannerDemo() {
        System.out.println("Please, enter your name: ");
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        System.out.println("Please, enter your age: ");
        int age = console.nextInt();
        System.out.println("Name: " + name + " - Age: " + age + " years old");
    }
}