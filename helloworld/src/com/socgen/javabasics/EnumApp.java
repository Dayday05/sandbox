package com.socgen.javabasics;

public class EnumApp {
    public static void main(String[] args) {
	CardinalPoint[] points = CardinalPoint.values();
	for (CardinalPoint cardinalPoint : points) {

	    System.out.println(cardinalPoint + ", is hot = " + cardinalPoint.isHot());

	}
    }
}
