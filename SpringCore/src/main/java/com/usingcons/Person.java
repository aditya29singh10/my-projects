package com.usingcons;

public class Person {
	
	private String name;
	private int personid;
	
	public Person(String name , int personid) {
		
		this.name = name;
		this.personid= personid;
	}
	public String toString() {
		return this.name+"    "+this.personid;
	}

}
