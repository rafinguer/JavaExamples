package org.javaexamples;

// An array is fixed list of elements of the same type

import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {

        // Arrays with native/single types
        nativeArrays();

        // Arrays with objects
        objectArrays();

        // Multidimensional arrays
        matrixes();
    }

    // Example with arrays using native types
    private static void nativeArrays() {
        System.out.println("------------------------");
        System.out.println("Arrays with native types");
        System.out.println("------------------------");
        // Syntax:
        //    type[] variable = new type[size];
        // You must define the size (number of elements)
        // Java will reserve memory for that list according to the specified type
        String[] names = new String[5];

        // Accessing to an element from the array:
        //    variable[index]   // Remember: first element starts at 0
        // Assigning value into the array:
        //    variable[index] = value;
        names[0] = "Rafael";  // first element (starting at index 0)
        names[1] = "Edu";     // Second element
        names[2] = "Nerea";   // Third element
        names[3] = "Clemen";  // Fourth element
        names[4] = "Goyi";    // last index (size -1)

        System.out.println("names: " + names);
        System.out.println("names size: " + names.length);

        for (int i=0; i<names.length; i++) {
            // Getting a value from the array:
            //    variable[index]
            System.out.println("- names[" + i + "] = " + names[i]);
        }

        // Other syntax array definition without the predetermined size
        //    type[] variable = {value1, value2, ...}
        String[] fruits = {"orange", "apple", "pineapple", "banana", "peach"};
        System.out.println("\nfruits: " + names);
        System.out.println("fruits size: " + fruits.length);

        for (int i=0; i<fruits.length; i++) {
            System.out.println("- fruits[" + i + "] = " + fruits[i]);
        }
    }

    // Example with arrays using object types
    private static void objectArrays() {
        System.out.println("------------------------");
        System.out.println("Arrays with object types");
        System.out.println("------------------------");

        // Example of arrays with objects
        Person[] persons = new Person[3];
        persons[0] = new Person("Rafael Hernamperez", "2nd Hide Park", 'M', 51);
        persons[1] = new Person("Eduardo Fernandez", "1st Orange Street", 'M', 52);
        persons[2] = new Person("Clemen del Bosque", "3rd Baker Street", 'F', 49);

        System.out.println("persons: " + persons);
        System.out.println("persons size: " + persons.length);

        for (int i=0; i<persons.length; i++) {
            System.out.println("- persons[" + i + "] = " + persons[i].toString());
        }
    }

    // Example with arrays using multiple dimensions (matrixes)
    // Note: This example is for learning purposes.
    // The best choice: 1 dimensional array using objects
    private static void matrixes() {
        System.out.println("------------------------");
        System.out.println("Multidimensional arrays");
        System.out.println("------------------------");

        // Example: Qualifications for 5 courses for 10 students
        // 2 dimensions: vertical = 2 (students), horizontal = 5 (courses)
        double[][] qualifications = new double[2][5];
        qualifications[0][0] = 8.5;   // student 1, course 1
        qualifications[0][1] = 7.4;   // student 1, course 2
        qualifications[0][2] = 6.9;   // student 1, course 3
        qualifications[0][3] = 8.8;   // student 1, course 4
        qualifications[0][4] = 9.2;   // student 1, course 5
        qualifications[1][0] = 5.8;   // student 2, course 1
        qualifications[1][1] = 4.7;   // student 2, course 2
        qualifications[1][2] = 9.6;   // student 2, course 3
        qualifications[1][3] = 7.5;   // student 2, course 4
        qualifications[1][4] = 6.9;   // student 2, course 5

        // Normal arrays. We define the name of the students and courses
        String[] students = {"Rafael Hernamperez", "Clemen del Bosque"};
        String[] courses = {"Java", "Python", "Rust", "Golang", "C#"};

        // Extracting the qualifications
        for (int i=0; i<students.length; i++) {   // qualifications.length = students.length
            System.out.println("Student: " + students[i]);

            for (int x = 0; x < courses.length; x++) {   // qualifications[i].length = courses.length
                System.out.println("   - Course: " + courses[x] + " - Qualification: " + qualifications[i][x]);
            }
        }
    }
}