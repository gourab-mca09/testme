package com.inherit;

public class ClassB extends ClassA {
	protected void print(){
		System.out.println("Print B");
	}
	
	protected void printq(){
		System.out.println("Print B");
	}
	
	public static void main(String [] args) {
		ClassA objA = new ClassB();
		objA.print();
	}
}
