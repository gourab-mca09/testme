package com.genericsQues;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class GenericTest{  
	//creating a method that accepts only child class of Shape  
	public static void drawShapes(List<? extends Shape> lists){  
	for(Shape s:lists){  
	s.draw();//calling method of Shape class by child class instance  
	}  
	}  
	public static void main(String args[]){  
	List<Rectangle> list1=new ArrayList<Rectangle>();  
	list1.add(new Rectangle());  
	  
	List<Circle> list2=new ArrayList<Circle>();  
	list2.add(new Circle());  
	list2.add(new Circle());  
	  
	drawShapes(list1);  
	drawShapes(list2);  
	
	HashMap<String, String> frozen = new HashMap<String, String>();
	frozen.put("1", "1_1");
	frozen.put("2", "1_2");
	
	frozen.remove( "1_2");
	
	System.out.println(frozen);
	
	}}  
