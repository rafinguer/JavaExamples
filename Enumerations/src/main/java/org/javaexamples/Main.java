package org.javaexamples;

public class Main {

    private static enum days {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }
    public static void main(String[] args) {
        demoDaysEnum();

        demoContinentsEnum();
    }

    private static void demoDaysEnum() {
        System.out.println("---------------------");
        System.out.println("Demo Days Enumeration");
        System.out.println("---------------------");

        int dayOfWeek = days.SUNDAY.ordinal();  // Ordinal returns the position in the enum (from 0)
        String day = getDay(dayOfWeek);
        System.out.println("Today is " + day + ". Weekend: " + isWeekEnd(dayOfWeek));

        dayOfWeek = days.MONDAY.ordinal();
        day = getDay(dayOfWeek);
        System.out.println("Today is " + day + ". Weekend: " + isWeekEnd(dayOfWeek));

        dayOfWeek = 3;  // Using directly the position as integer
        day = getDay(dayOfWeek);
        System.out.println("Today is " + day + ". Weekend: " + isWeekEnd(dayOfWeek));

        dayOfWeek = 6;
        day = getDay(dayOfWeek);
        System.out.println("Today is " + day + ". Weekend: " + isWeekEnd(dayOfWeek));
    }


    // This method returns true if day of Week is 0 (Sunday) or 6 (Saturday)
    // In other case, returns false (1..5 - Monday to Friday
    private static boolean isWeekEnd(int day) {
        // Method ordinal returns the position of the value in the enumeration
        return (day == days.SUNDAY.ordinal() || day == days.SATURDAY.ordinal());
    }

    // This method resolves the name of the day using its position in the enumeration
    private static String getDay(int day) {
        String result = "";

        for (int i=days.SUNDAY.ordinal(); i<=days.SATURDAY.ordinal(); i++) {
            if (i == day) {
                result = days.values()[i].toString();
                break;
            }
        }

        return result;
    }

    // This method uses Continents enum, located on Continents.java
    private static void demoContinentsEnum() {
        System.out.println("---------------------------");
        System.out.println("Demo Continents Enumeration");
        System.out.println("---------------------------");

        for (int i=0; i<Continents.values().length; i++) {
            System.out.println("Continent #" + i + ": " +
                    Continents.values()[i].toString() + ": " +
                    Continents.values()[i].getCountries() + " countries");
        }
    }
}