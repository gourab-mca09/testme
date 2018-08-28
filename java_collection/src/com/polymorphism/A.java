package com.polymorphism;

public class A {

	public void AB(){
		System.out.println("no Param");
	}
	public void AB(int a){
		System.out.println("one Param");
	}
	public void AB(int b, int c){
		System.out.println("two Param");
	}
	public static void AB(int a, int b, int c){
		System.out.println("three Param");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.AB();
		a.AB(1);
		a.AB(0, 0);
		a.AB(0, 0, 0);
	}

}
