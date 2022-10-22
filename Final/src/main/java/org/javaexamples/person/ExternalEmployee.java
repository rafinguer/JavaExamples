// Defines the scope/package for this class
package org.javaexamples.person;

// This class can see the other classes in this package
// You don't need to import Employees or Person classes

// Any class in other packages must imported

// You cannot extend ExternalEmployee class from Employee class
// This will provoke an error, because Employee class is a final class
// public class ExternalEmployee extends Employee{
public class ExternalEmployee extends Person{
    private int externalEmployeeId;
    private double salary;

    // Getters and Setters
    public int getExternalEmployeeId() {
        return externalEmployeeId;
    }

    public void setExternalEmployeeId(int externalEmployeeId) {
        this.externalEmployeeId = externalEmployeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "External Employee{" +
                "externalEmployeeId=" + externalEmployeeId +
                ", salary=" + salary +
                '}';
    }
}