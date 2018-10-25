package com.socgen.javabasics;

public class Application {

    public static void main(String[] args) {

    }

    public static void compare() {
	boolean cond = 10 < 0;
	int value = 5;
	System.out.println(cond);

	if (cond) {
	    System.out.println("10 is not less than 0");
	} else {
	    System.out.println("10 is greater than 0");
	}

	if (value == 0) {
	    System.out.println("Les maths ont bien changé depuis...");
	} else {
	    System.out.println("C'est quand même rassurant :)");
	}

    }

    private static void autoboxing() {
	int value = 32;
	Integer boxed = Integer.valueOf(value);
	Integer autoboxed = value;
	System.out.println(autoboxed);

	int age = Integer.valueOf(32); // (Auto)unBoxing
    }

    private static void sum(double... values) {
	double total = 0.0;

	for (double d : values) {
	    total += d;
	}

	System.out.println("total=" + total);
    }

}
