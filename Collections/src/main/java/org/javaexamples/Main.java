package org.javaexamples;

import java.util.*;

// A collection is a dynamic array.
// The size of a collection can be variable (you can add or delete elements)
// There are some types of collections:
//    - List<-Collection
//    - Set<-Collection
//    - HashMap<-Map
// All the collections manage any object type

public class Main {
    public static <Hash> void main(String[] args) {
        listDemo();

        setDemo();

        hashDemo();
    }

    private static void listDemo() {
        System.out.println("------------");
        System.out.println("Testing List");
        System.out.println("------------");

        // A list of objects
        List days = new ArrayList();
        days.add("Monday");   // You can add objects (String is an object)
        days.add("Tuesday");
        days.add("Wednesday");

        System.out.println("Size of 'days' list: " + days.size());

        for(Object day: days) {
            System.out.println("   Day: " + day);
        }

        System.out.println("days.get() -> Second day: " + days.get(1));  // Index position starts at 0
        System.out.println("days.contains('Tuesday') -> Is 'Tuesday' in 'days': " + days.contains("Tuesday"));
        System.out.println("days.indexOf('Wednesday') -> 'Wednesday' is at position " + days.indexOf("Wednesday"));
        System.out.println("days.remove('Tuesday' -> ");
        days.remove("Tuesday");

        printDays(days);

        System.out.println("days.remove(0) -> ");
        days.remove(0);

        // forEach() method can be used to explore the list using a lambda
        printDays(days);

        System.out.println("days.clear() -> ");
        days.clear();
        System.out.println("Size of 'days' list: " + days.size());
    }

    // A Set is like a List, but it does not allow repeated elements
    private static void setDemo() {
        System.out.println("-----------");
        System.out.println("Testing Set");
        System.out.println("-----------");

        // A set of objects
        Set days = new HashSet();
        days.add("Monday");   // You can add objects (String is an object)
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Monday");  // don't be added (repeated)
        days.add("Wednesday");  // don't be added (repeated)

        System.out.println("Size of 'days' list: " + days.size());
        printDays(days);
    }

    private static void printDays(Collection collection) {
        // forEach() method runs through all the elements of a collection
        // Each value is captured by a variable using a lambda
        collection.forEach(day -> System.out.println("   Day: " + day));
    }

    private static void hashDemo() {
        System.out.println("---------------");
        System.out.println("Testing HashMap");
        System.out.println("---------------");

        // A Hashmap is a collection that store a key and a value
        // The key must be unique in the collection
        // When you declare a hashmap, you can define the type of the key and the value
        HashMap<String, Double> salaries = new HashMap();
        salaries.put("John Doe", 23500.50);
        salaries.put("Jane Doe", 31575.50);
        salaries.put("Mike Best", 28770.00);
        salaries.put("Lucy Brown", 29995.95);
        salaries.put("Samantha Green", 26500.50);

        System.out.println("Size of the hashmap: " + salaries.size());

        // Exploring the keys
        System.out.println("Exploring the keys");
        for (String key: salaries.keySet()) {
            System.out.println("   Key: " + key);
        }

        // Exploring the values
        System.out.println("Exploring the values");
        for (Double value: salaries.values()) {
            System.out.println("   Value: " + value);
        }

        // Exploring the hashmap using a for loop
        System.out.println("Exploring the hashmap using a for loop");
        for(Map.Entry<String, Double> salary: salaries.entrySet()) {
            System.out.println("   key: " + salary.getKey() + " - value: " + salary.getValue());
        }

        // To access the value in the hashmap, use the key
        System.out.println("Mike Best's salary: " + salaries.get("Mike Best"));

        System.out.println("Removing Mike Best from the hashmap...");
        salaries.remove("Mike Best");

        System.out.println("Exploring the hashmap using an iterator");
        // Exploring the hashmap using iterator
        Iterator it = salaries.entrySet().iterator();

        while(it.hasNext()) {
            Map.Entry<String, Double> salary = (Map.Entry) it.next();
            System.out.println("   key: " + salary.getKey() + " - value: " + salary.getValue());
        }
    }
}