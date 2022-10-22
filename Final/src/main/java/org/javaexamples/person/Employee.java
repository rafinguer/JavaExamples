// Defines the scope/package for this class
package org.javaexamples.person;

// This class can see the other classes in this package
// You don't need to import Employees or Person classes

// Any class in other packages must imported

// A final class avoids that anyone can create a sub-class for this one
public final class Employee extends Person{
    private int employeeId;
    private double salary;

    // Getters and Setters
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Overwritten methods from parent class (Person)
    // You cannot override final methods
    // This will provoke an error

    /*
    public final String getFullName() {
        return super.getFullname();
    }

    public final void setFullName(String fullName) {
        super.setFullName(fullName);
    }
     */

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", salary=" + salary +
                '}';
    }
}
