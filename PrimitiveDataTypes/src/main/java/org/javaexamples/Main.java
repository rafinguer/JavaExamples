package org.javaexamples;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        primitiveInteger();
        primitiveFloat();
        primitiveBoolean();
        primitiveConversions();
    }

    // Primitive integer data types
    // - byte (8 bits)
    // - short (16 bits)
    // - char (16 bits)
    // - int (32 bits)
    // - long (64 bits)
    private static void primitiveInteger() {
        System.out.println("------------------");
        System.out.println("PRIMITIVE INTEGERS");
        System.out.println("------------------");

        byte byteValue = 10;
        //byte byteValue = (byte)10;  // casting
        System.out.println("Byte value: " + byteValue);
        System.out.println("Minimum byte value: " + Byte.MIN_VALUE);
        System.out.println("Maximum byte value: " + Byte.MAX_VALUE);

        short shortValue = 28900;
        // short shortValue = (short)28900;  // casting
        System.out.println("Short value: " + shortValue);
        System.out.println("Minimum short value: " + Short.MIN_VALUE);
        System.out.println("Maximum short value: " + Short.MAX_VALUE);

        char charValue = 'Z';
        System.out.println("Char value: " + charValue);
        System.out.println("Minimum char value: " + Character.MIN_VALUE);
        System.out.println("Maximum char value: " + Character.MAX_VALUE);

        charValue = '\u0021'; // !
        System.out.println("Char value: " + charValue);

        charValue = 35;   // #
        System.out.println("Char value: " + charValue);

        var symbolChar = (char)35;   // # by inference
        System.out.println("Char symbol: " + symbolChar);

        int asciiChar = '#';   // Gets the ASCII code number (35)
        System.out.println("# Ascii value: " + asciiChar);


        int intValue = 28900230;
        // int intValue = (int)28900230;   // casting
        // var intValue = 28900230;   //  inference
        System.out.println("Int value: " + intValue);
        System.out.println("Minimum int value: " + Integer.MIN_VALUE);
        System.out.println("Maximum int value: " + Integer.MAX_VALUE);

        long longValue = 354995009L;
        //long longValue = (long)354995009;  // casting
        System.out.println("Long value: " + longValue);
        System.out.println("Minimum long value: " + Long.MIN_VALUE);
        System.out.println("Maximum long value: " + Long.MAX_VALUE);
    }

    // Primitive float data types
    // - float (32 bits)
    // - double (64 bits)
    private static void primitiveFloat() {
        System.out.println("---------------");
        System.out.println("PRIMITIVE FLOAT");
        System.out.println("---------------");

        float floatValue = 2987.45F;
        // float floatValue = (float)2987.45;  // casting
        // var floatValue = 2987.45F;   // inference
        System.out.println("Float value: " + floatValue);
        System.out.println("Minimum float value: " + Float.MIN_VALUE);
        System.out.println("Maximum float value: " + Float.MAX_VALUE);

        double doubleValue = 2987967.78D;
        // double doubleValue = (double)2987967.78  // casting
        // var doubleValue = 2987967.78D;
        System.out.println("Double value: " + doubleValue);
        System.out.println("Minimum double value: " + Double.MIN_VALUE);
        System.out.println("Maximum double value: " + Double.MAX_VALUE);
    }


    // Primitive boolean data types
    // - boolean
    private static void primitiveBoolean() {
        System.out.println("-----------------");
        System.out.println("PRIMITIVE BOOLEAN");
        System.out.println("-----------------");

        boolean isMarried = true;
        System.out.println("Is married?:" + isMarried);

        int age = 17;
        System.out.println("Is adult?:" + (age >= 18));
    }

    // Code examples for primitive conversions
    private static void primitiveConversions() {
        System.out.println("---------------------");
        System.out.println("PRIMITIVE CONVERSIONS");
        System.out.println("---------------------");

        // Conversion from String to integer
        var stringAge = "25";  // string
        var intAge = Integer.parseInt(stringAge);
        System.out.println("stringAge + 5 = " + stringAge + 5);
        System.out.println("In five years you will be " + (intAge + 5) + " years old");

        // Conversion from String to float
        var stringPI = "3.141592";
        var pi = Float.parseFloat(stringPI);
        var radius = 14.5;
        System.out.println("Area of circle with radius " + radius + ": " + pi * (radius * radius));

        // Scanning a radius value from the console via keyboard
        System.out.println("Please, enter the radius of your circle:");
        var console = new Scanner(System.in);
        radius = Float.parseFloat(console.nextLine());
        System.out.println("Area of circle with radius " + radius + ": " + pi * (radius * radius));

        // Conversion from integer to String
        stringAge = String.valueOf(intAge + 5);
        System.out.println("stringAge: \"" + stringAge + "\"");

        // Extract character from string
        String name = "Rafael";
        char letter = name.charAt(2);   // 'f'
        char initial = name.charAt(0);  // 'R'
        System.out.println("Rafael.charAt(2): \'" + letter + "\'");
        System.out.println("Initial from Rafael: \'" + initial + "\'");


    }
}

