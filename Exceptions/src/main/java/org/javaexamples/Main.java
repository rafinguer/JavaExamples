package org.javaexamples;

public class Main {
    public static void main(String[] args) {
        System.out.println("Simple case. Exception divide by zero.");
        simpleCase();

        System.out.println("Finally case. Exception divide by zero.");
        finallyCase();

        System.out.println("Throw case. Exception divide by zero.");
        double result = 0;

        try {
            result = divide(3, 0);
            System.out.println("   Throw case. Result of divide is " + result);
        } catch (CustomException e) {
            System.out.println("   - CustomException message: " + e.getMessage());
            System.out.println("   - CustomException class: " + e.getClass());
        }

        System.out.println("Tracking case. Exception divide by zero.");
        trackingCase();


    }

    // Simple exception case
    // try {
    //    <code_that_could_fail>
    // } catch (Exception <variable>) {
    //    <code_when_exception_occurs>
    // }
    private static void simpleCase() {
        int value = 3;

        try {
            value = value / 0;
        } catch (Exception e) {
            System.out.println("   - Error. You cannot divide by zero");
            System.out.println("   - Error: " + e.toString());
        }
    }

    // The finally block is located after try...catch
    // The code in this block is executed both try and catch flow
    private static void finallyCase() {
        int value = 3;

        try {
            value = value / 0;
        } catch (Exception e) {
            System.out.println("   - Error. You cannot divide by zero");
            System.out.println("   - Error: " + e.toString());
        } finally {
            System.out.println("   * method finished() *");
        }
    }

    // catch sentence captures the exception and save it in a variable
    // This variable is an Exception object with properties and methods
    // The printStackTrace method prints the tracking of the exepetion
    private static void trackingCase() {
        int value = 3;

        try {
            value = value / 0;
        } catch (Exception e) {
            System.out.println("   - Error. You cannot divide by zero");
            System.out.printf("   - Track: ");
            e.printStackTrace(System.out);
        }
    }

    // In this example, we will use a custom Exception type
    // We can create our own exceptions, creating a class that extends Exception class
    // The method must be declared with the possible exceptions using the throws sentence
    // In the code, we must to control the possible exceptions,
    // using the throw sentence in that case
    private static double divide(int num1, int num2) throws CustomException{
        if (num2 == 0) {
            throw new CustomException("Error trying to divide " + num1 + " by " + num2);
        } else {
            return num1 / num2;
        }
    }

}