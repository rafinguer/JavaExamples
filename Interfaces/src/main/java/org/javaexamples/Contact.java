package org.javaexamples;

// A class that implements an interface
// must implement the code of each method of the interface
// In this example we use fake data.
// In a real case, we will use a Data Object.
public class Contact implements IDataAccess {

    private String name;
    private String email;

    public Contact(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public void createData() {
        System.out.println("Data " + getData() + " has been created");
    }

    @Override
    public void updateData() {
        System.out.println("Data " + getData() + " has been updated");
    }

    @Override
    public void deleteData() {
        System.out.println("Data " + getData() + " has been deleted");
    }

    @Override
    public String[] selectData(String criteria) {
        String[] result = { getData(), getData(), getData(), getData(), getData() };
        return result;
    }

    private String getData() {
        return "{ name: \"" + this.name + "\", email: \"" + this.email + "\" }";
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
