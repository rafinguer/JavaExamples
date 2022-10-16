package org.javaexamples;

// Loops:
//    - while
//    - do...while
//    - for
//    - continue/break

public class Main {
    public static void main(String[] args) {
        whileLoop();
        doWhileLoop();
        forLoop();
        continueBreak();
    }

    // Code example for while loops
    private static void whileLoop() {
        System.out.println("----------");
        System.out.println("WHILE LOOP");
        System.out.println("----------");

        int counter = 1;

        // The condition is evaluated before the execution of the loop
        // While the condition is fulfilled
        // If, at the beginning, the condition is not fulfilled
        // the loop is never executed
        while (counter <= 10) {
            System.out.println("counter = " + counter);
            counter++;
        }
    }

    // Code example for do while loops
    // This loop is executed, at least, one time
    private static void doWhileLoop() {
        System.out.println("-------------");
        System.out.println("DO WHILE LOOP");
        System.out.println("-------------");

        int counter = 20;

        // The code of the loop is executed before the condition is evaluated
        // At least, the loop is executed on time
        // Then, the loop will be executed While the condition is fulfilled
        do {
            System.out.println("counter = " + counter);
            counter++;
        } while (counter <= 10);
    }

    // Code example with for loops
    private static void forLoop() {
        System.out.println("--------");
        System.out.println("FOR LOOP");
        System.out.println("--------");

        // for(startingValue; condition; increment)
        // Counting from 20 to 2, step -2
        for (int i = 20; i > 0; i -= 2) {
            System.out.println(i);
        }

        int number = 5;

        // Multiplication table of number
        for (int i = 1; i <= 10; i++) {
            System.out.println("" + i + " x " + number + " = " + (i * number));
        }
    }

    // Code example for continue/break sentences
    private static void continueBreak() {
        System.out.println("------------------------");
        System.out.println("CONTINUE/BREAK SENTENCES");
        System.out.println("------------------------");

        int counter = 0;

        // Infinite loop
        while (true) {
            counter++;

            // If not even, jump to the next cycle of the loop (go to beginning)
            if (counter % 2 != 0) {
                continue;
            }

            // If counter is higher than 20, breaks the loop
            if (counter > 20) {
                break;
            }

            System.out.println(counter);
        }

        System.out.println("Loop broken");
    }
}