package com.socgen.javabasics;

public class Application {

    public static void main(String[] args) {

	String majorityStr = args[];
	
	Integer majority = Integer.valueOf(majorityStr);

	int maj = majority.intValue();

	System.out.println("Majority=" + maj);

	Person david = new Person("David", "Dik", maj);
	Person louis = new Person("Louis", "Godlewski", maj);

	System.out.println(david);
	System.out.println(louis);
    }

}
