package com.infineon.practices.practice1;

public class Student {
    private String firstName;
    private String lastName;

    public Student(String firstName, String lastName) {
        super();

        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
