package com.socgen.javabasics;

public class Array {

//     Array est un container
//     Set
//     Data Structure
//     [_|_|_|_|_|_] <- Bucket
//     Length
//     Longeur fixe à la construction
//     Un objet
//     Typé = même type -> primitifs / objets

    public static void main(String[] args) {
	int[] ints = new int[10];
	ints[3] = 5;
	System.out.println(ints[3]);

	boolean[] booleans = new boolean[10];
	booleans[2] = true;
	for (int i = 0; i < booleans.length; i++)
	    ;

	String explosion = "Bonjour à tous";
	char[] explosionTab = explosion.toCharArray();
	for (int i = 0; i < explosionTab.length; i++) {

	    System.out.println(explosionTab[i]);
	}
    }
}
