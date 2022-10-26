package org.javaexamples;

// An interface defines the behavior of the classes that implement it
// The methods are declared, but not defined
// The variables are constants
public interface IDataAccess {
    int page_size = 20;

    void createData();

    void updateData();

    void deleteData();

    String[] selectData(String criteria);
}
