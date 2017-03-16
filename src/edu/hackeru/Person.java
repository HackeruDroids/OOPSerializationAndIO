package edu.hackeru;

import com.sun.istack.internal.NotNull;

import java.io.Serializable;

public class Person implements Serializable{
    private String firstName;
    private String lastName;

    //constructor
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    //Serialization (Object to binary)
    public String toCSV() {
        return String.format("%s;%s%s",
                firstName, lastName, System.lineSeparator()
        );
    }
    //Factory method
    //deserialization (binary to Object)
    public static Person fromCSV(@NotNull String csv ){
        String[] parts = csv.split(";");
        if (parts.length !=2)
            throw new RuntimeException("Bad format");
        return new Person(parts[0], parts[1]);
    }


}
