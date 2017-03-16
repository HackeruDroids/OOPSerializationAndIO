package edu.hackeru;

import com.sun.istack.internal.NotNull;

public class Person {
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

    public String toCSV() {
        return String.format("%s;%s%s",
                firstName, lastName, System.lineSeparator()
        );
    }

    //Factory method
    public static Person fromCSV(@NotNull String csv ){
        String[] p = csv.split(";");
        if (p.length !=2)
            throw new RuntimeException("Bad format");
        return new Person(p[0], p[1]);
    }


}
