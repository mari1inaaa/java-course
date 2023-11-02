package edu.hw3.Task5;

public class Contact {
    private String name;

    public Contact(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        String[] fullName = name.split(" ");
        if (fullName.length > 1) {
            return fullName[1];
        }
        return fullName[0];
    }
}
