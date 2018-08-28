package com.abst;

class Tomcat extends Server {

		
	public Tomcat(String name) {
		super(name);
	
	}
	
	
	
	public  void TestFunc(){
		System.out.println("Here is the Tomcat");
	}
	
	public boolean start() {
		System.out.println( this.name + " started successfully");
		return false;
	}

}
