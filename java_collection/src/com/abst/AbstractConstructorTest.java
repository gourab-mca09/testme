package com.abst;




public class AbstractConstructorTest {
	// gouorab
	public static void main(String args[]) {
		  
	      Server server = new Tomcat("Apache Tomcat");
	      
	      System.out.println("name>>"+ server.name);
	      
	      server.TestFunc();
	      
	      server.start();
	      
	}

}
