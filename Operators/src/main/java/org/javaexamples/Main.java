package org.javaexamples;

// Aritmethic operators
// +, -, *, /, %
// Assignment operators
// ++, --, =, *=, /=, %=, +=, -=, <<=, >>=, >>>=, &=, |=, ^=
// Unit operators
// ~, -
// Relationship and equality operators
// <, >, <=, >=, !=, ==
// Logical operators
// &, &&, |, ||, !, ^
// Ternary or Conditional operator
// ?:
// bitwise operators
// &, |, ^, <<, >>, >>>

// Priority and order of evaluation
// (), [], ., - ~ ! ++ --, new(type) expression
// -, << >> >>>, < <= > >=, == !=, &
// ||, ?:

public class Main {
    public static void main(String[] args) {
        arithmetic();
        assignment();
        unit();
        equality();
        relationship();
        logical();
        ternary();
    }

    // Aritmethic operators
    private static void arithmetic() {
        System.out.println("--------------------");
        System.out.println("Aritmethic operators");
        System.out.println("--------------------");

        int a=12, b=2;
        System.out.println("" + a + " + " + b + " = " + (a + b));
        System.out.println("" + a + " - " + b + " = " + (a - b));
        System.out.println("" + a + " * " + b + " = " + (a * b));
        System.out.println("" + a + " / " + b + " = " + (a / b));
        System.out.println("" + a + " % " + b + " = " + (a % b));

        if (a % b == 0) {
            System.out.println("" + a + " is an even number");
        } else {
            System.out.println("" + a + " is an odd number");
        }
    }

    // Assignment operators
    private static void assignment() {
        System.out.println("--------------------");
        System.out.println("Assignment operators");
        System.out.println("--------------------");

        int a=12, b=2;
        int result = a + 5 - b;  // 15

        System.out.println("Result: " + result);

        result+= 7; // result = result + 7  (22)
        result-= 3; // result = result - 3  (19)
        result*= 4; // result = result * 4  (76)
        result/= 2; // result = result / 2  (38)

        System.out.println("Result: " + result);

        result%= 2; // result = result % 2  (0)  Even number

        System.out.println("Result: " + result);
    }

    // Unit operators (only one target is implied)
    private static void unit() {
        System.out.println("--------------");
        System.out.println("Unit operators");
        System.out.println("--------------");

        // - operator (sign change)
        int a = 12, b = -a;
        System.out.println("a: " + a);
        System.out.println("b (-a): " + b);

        // ! operator (boolean inverter)
        boolean c = true, d = !c;
        System.out.println("c: " + c);
        System.out.println("d (!d): " + d);

        // pre-increment (first increments the variable, and then assigns it)
        int result = ++a;   // a = a + 1; result = a;   (result=13, a=13)
        System.out.println("result (++a): " + result + " - a: "+ a);

        // post increment (first asigns and then increments)
        result = a++;   // result = a; a = a + 1;  (result=13, a=14)
        System.out.println("result (a++): " + result + " - a: "+ a);

        // Pre-decrement
        result = --a;   // a = a -1; result = a;  (result=13, a=13)
        System.out.println("result (--a): " + result + " - a: "+ a);

        // post-decrement
        result = a--;   // result = a; a = a - 1  (result=13, a=12)
        System.out.println("result (a--): " + result + " - a: "+ a);
    }


    // Equality operators
    private static void equality() {
        System.out.println("------------------");
        System.out.println("Equtlity operators");
        System.out.println("------------------");

        int a=12, b=2;

        // Equality
        System.out.println("a == b: " + (a == b));  // false
        System.out.println("a == b: " + (a != b));  // true

        String c="Hello", d="Bye";
        boolean e=(c == d);
        System.out.println("e (a == b): " + e);  // false

        boolean f = c.equals(d);
        System.out.println("f (a.equals(b)): " + f);  // false
    }

    // Relationship operators
    private static void relationship() {
        System.out.println("----------------------");
        System.out.println("Relationship operators");
        System.out.println("----------------------");

        int a=12, b=2;

        // Equality
        System.out.println("" + a + " == " + b + " = " + (a == b));
        System.out.println("" + a + " != " + b + " = " + (a != b));

        // Relationship
        System.out.println("" + a + " > " + b + " = " + (a > b));
        System.out.println("" + a + " >= " + b + " = " + (a >= b));
        System.out.println("" + a + " < " + b + " = " + (a < b));
        System.out.println("" + a + " <= " + b + " = " + (a <= b));
    }


    // Logical operators
    private static void logical() {
        System.out.println("-----------------");
        System.out.println("Logical operators");
        System.out.println("-----------------");

        // && (AND)
        int a = 10, b = 11, min = 0, max = 10;
        boolean result = (a>=min && a<=max);
        System.out.println("Is "+ a + " between " + min + " and " + max + "?: " + result);

        result = (b>=min && b<=max);
        System.out.println("Is "+ b + " between " + min + " and " + max + "?: " + result);

        // || (OR)
        boolean isWeekend = false;
        boolean isHoliday = false;
        result = (isWeekend || isHoliday);
        System.out.println("Can you sleep longer today?: " + result);

        isHoliday = true;
        result = (isWeekend || isHoliday);
        System.out.println("Can you sleep longer tomorrow?: " + result);
    }

    // Ternary or conditional operator
    private static void ternary() {
        System.out.println("----------------");
        System.out.println("Ternary operator");
        System.out.println("----------------");

        int a = 12, b = 5;
        boolean result = (a % 2 == 0) ? true : false;
        System.out.println("Is " + a + " an even number?: " + result);

        result = (b % 2 == 0) ? true : false;
        System.out.println("Is " + b + " an even number?: " + result);

        result = (a > b) ? true : false;
        System.out.println("Is " + a + " greater than " + b + "?: " + result);
    }
}