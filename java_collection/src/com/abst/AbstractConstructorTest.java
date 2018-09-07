package com.abst;




public class AbstractConstructorTest extends Thread {
	
	@Override
	public void run() {System.out.println("33333333333333333333333333333333");
		try {
			wait();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}System.out.println("Resumed");
		
		
	}
	
	interface TestInterface{
		public void A(int a);
	}
	
	// gouorab ssss sxd
	public static void main(String args[]) {
		
		 TestInterface obj = (int a)->System.out.println(a * a );
		 obj.A(34);
		
		 AbstractConstructorTest a =  new AbstractConstructorTest()
				 ;
		 a.start();
		 new  TestInterface() {
			 @Override
			 public void A(int a) {
				 System.out.println("asdasdasda");
				 notify(); 
			 }
		 }.A(34);
		 
	      Server server = new Tomcat("Apache Tomcat");
	      
	      System.out.println("name>>"+ server.name);
	      
	      server.TestFunc();
	      
	      server.start();
	      
	     
	}

}
