package edu.hackeru;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Person p = new Person("Moshe", "Cohen");
        Person p2 = new Person("Misha", "Doe");

        List<Object> people = new ArrayList<>();
        people.add(p);
        people.add(p2);
        FileIO.writeObjects("persons.bin", people);


        List<Object> objects = FileIO.readObjects("persons.bin");
        for (Object o : objects) {
            System.out.println(o);
        }

    }
}
