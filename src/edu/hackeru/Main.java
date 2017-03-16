package edu.hackeru;

public class Main {

    public static void main(String[] args) {
        //1) add names while the user chooses 1)
        //2) list all the names from the file.2)

        int choice = 1;
        while (choice != 2) {
            choice = IO.getInt("Choose an option:\n" +
                    "1) Add Name\n" +
                    "2) List All names\n");
            if (choice == 2) break;

            String name = IO.getString("Enter Name:");
            FileIO.writeln("names.txt", name, true);
        }

        //list all the names:
        String read = FileIO.read("names.txt");
        System.out.println(read);
    }
}
