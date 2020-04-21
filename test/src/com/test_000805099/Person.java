package com.test_000805099;

public class Person {
    private String lastName;
    private int age;

    public Person () {
        System.out.println("Person no-arg constructor.");
    }

    public Person (String lastName) {
        this.setLastName(lastName);
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
