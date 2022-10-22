package org.javaexamples;

// Method overloading
// You can define several methods with the same name but different parameters
// By this way, you have different versions of the same method
// You can use the method using different syntaxis
public class Main {
    public static void main(String[] args) {
        // Creating person1 object with default constructor
        Person person1 = new Person();
        System.out.println("person1: " + person1.toString());

        // Creating person2 object with overloaded constructor (with parameters)
        Person person2 = new Person("Rafael Hernamperez", "2nd Orange Avenue", 'M', 51);
        System.out.println("person2: " + person2.toString());

        // Using simple version of sum() method
        int result = sum(12, 45);
        System.out.println("Result simple sum(): " + result);

        // Using complex version of sum() method
        result = sum(12, 45, 32, 6, 82, 4);
        System.out.println("Result complex sum(): " + result);
    }

    // Simple sum() method, using only two values
    public static int sum (int value1, int value2) {
        return value1 + value2;
    }

    // Complex sum() method
    // values is a list of multple values
    public static int sum (int... values) {
        int result = 0;
        for (int i=0; i<values.length; i++) {
            result += values[i];
        }
        return result;
    }
}