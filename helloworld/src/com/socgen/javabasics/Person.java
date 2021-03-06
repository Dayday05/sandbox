package com.socgen.javabasics;

public class Person {
    private String firstname;

    private String lastname;

    private int age;

    public Person(String firstname, String lastname, int age) {
	this.firstname = firstname;
	this.lastname = lastname;
	this.age = age;
    }

    public String getFirstname() {
	return this.firstname;
    }

    public String getLastname() {
	return this.lastname;
    }

    public int getAge() {
	return this.age;
    }

    @Override
    public String toString() {
	return "Person [firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + "]";
    }

}
