package org.javaexamples;

// This class defines and implements a new Exception type
// The class must extends from Exception parent class
public class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
