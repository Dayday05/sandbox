package com.socgen.javabasics;

/**
 * 
 * @author David
 * 
 *         JavaDoc Exemple
 *
 */

public class Calculator {

    private double a;
    private double b;

    /**
     * 
     * @param a : operand a
     * @param b : operand b
     */

    public Calculator(double a, double b) {

	this.a = a;
	this.b = b;
    }

    /**
     * 
     * @return
     */

    public double add() {
	return this.a + this.b;
    }

    public double substract() {
	return this.a - this.b;
    }

    public double divide() {

	return this.a / this.b;
    }

    public double multiply() {
	return this.a * this.b;
    }

}

// Stringbuffer 
// toString -> Methode javalangOBJECT