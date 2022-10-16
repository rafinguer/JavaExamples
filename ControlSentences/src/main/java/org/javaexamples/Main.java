package org.javaexamples;

// Control sentences:
//   - if-else
//   - ternary operator
//   - if-else if...
//   - switch

public class Main {
    public static void main(String[] args) {
        ifElse();
        ternary();
        multipleIfElse();
        switchSentence();
    }

    // if-else
    // if (condition) {
    //    to-do-if-true
    // } [else {
    //    to-do-if-false
    // }]
    private static void ifElse() {
        int a = 21;

        System.out.print("[if-else]: ");

        if (a % 2 == 0) {
            System.out.println("Even number (" + a + ")");
        } else {
            System.out.println("Odd number (" + a + ")");
        }
    }

    // Example code with ternary operator
    private static void ternary() {
        int a = 12;
        String result = (a % 2 == 0) ? "Even" : "Odd";
        System.out.println("[ternary]: " + result + " number (" + a + ")");
    }

    // Evaluating multiple conditions with if-else
    private static void multipleIfElse() {
        int age = 50;

        System.out.print("[multiple if-else]: ");

        if (age <= 4) {
            System.out.println("You are a baby (" + age + " years old)");
        } else if (age <= 13) {
            System.out.println("You are a child (" + age + " years old)");
        } else if (age < 18) {
            System.out.println("You are a teenager (" + age + " years old)");
        } else if (age <= 30) {
            System.out.println("You are a young (" + age + " years old)");
        } else if (age <= 60) {
            System.out.println("You are an adult (" + age + " years old)");
        } else if (age <= 75) {
            System.out.println("You are old (" + age + " years old)");
        } else if (age < 100) {
            System.out.println("You are very old (" + age + " years old)");
        } else {
            System.out.println("You are a mummy (" + age + " years old)");
        }
    }

    // Example code with switch sentence
    private static void switchSentence() {
        String season = "Unknown";  // default value for season
        int month = 10;

        System.out.print("[switch]: ");

        switch(month) {
            case 1: case 2: case 12:
                season = "Winter";
                break;
            case 3: case 4: case 5:
                season = "Spring";
                break;
            case 6: case 7: case 8:
                season = "Summer";
                break;
            case 9: case 10: case 11:
                season = "Autumn";
                break;
            default:
                season = "Unknown month: " + month;
        }

        System.out.println("Month: " + month + ". Season: " + season);
    }
}