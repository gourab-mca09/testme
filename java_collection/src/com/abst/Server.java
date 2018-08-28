package com.abst;

abstract class Server {
	protected  String name;
	 
	public Server(){
		
	}
	public Server(String name){
		System.out.println(name);
		this.name=name;
	}
	
	
	public  void TestFunc(){
		System.out.println("Here is the server");
	}
	
	public abstract boolean start();
}
