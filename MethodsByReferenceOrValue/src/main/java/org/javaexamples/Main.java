package org.javaexamples;

public class Main {

    public static void main(String[] args) {
        int value = 32;

        // Simple example passing by value
        System.out.println("* main() executing");
        System.out.println("   -> value before call byValue(): " + value);
        byValue(value);
        System.out.println("* main() executing");
        System.out.println("   -> value after call byValue(): " + value);

        // Changing the value reassigning the returned value
        System.out.println("   -> value before call byValueReturned(): " + value);
        value = byValueReturned(value);
        System.out.println("* main() executing");
        System.out.println("   -> value after call byValueReturned(): " + value);

        // When you pass a class instance, this will be passed by reference
        ClassExample example = new ClassExample();
        System.out.println("* main() executing");
        System.out.println("   -> example.data before call byReference(): " + example.data);
        byReference(example);
        System.out.println("* main() executing");
        System.out.println("   -> example.data after call byReference(): " + example.data);
    }


    // By value
    // 'arg' parameter is a local variable to the method
    // 'arg' receives the value passed from caller (main())
    // Each operation with 'arg' is only affected in the method scope
    // Once the methods is finished, 'arg' is destroyed
    public static void byValue(int arg) {
        System.out.println("* byValue() executing");
        System.out.println("   -> arg received value: " + arg);
        arg *= 2;
        System.out.println("   -> arg updated value: " + arg);
    }

    // By value with return
    // If you want modify the original value with a method
    // passing the value by value, you must to reassign the
    // value returned by the method (internally, make changes to the value)
    public static int byValueReturned(int arg) {
        System.out.println("* byValueReturned() executing");
        System.out.println("   -> arg received value: " + arg);
        arg *= 2;
        System.out.println("   -> arg updated value: " + arg);
        return arg;
    }


    // An argument based on one object type (based on classes)
    // it will receive the reference of the object from the caller (main())
    // Working with references allows you to process the argument
    // as if you work with the original object, because both,
    // argument and original object, shares the same reference
    // (really, argument operates over the original object
    // using its reference)
    public static void byReference(ClassExample exampleArg) {
        System.out.println("* byReference() executing");
        System.out.println("   -> exampleArg.data received value: " + exampleArg.data);
        exampleArg.duplicate();
        exampleArg.data += 3;
        System.out.println("   -> exampleArg.data updated value: " + exampleArg.data);
    }
}
