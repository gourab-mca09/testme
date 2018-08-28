package com.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashCall {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap hm = new HashMap();
	      // Put elements to the map
	      hm.put("Zara", new Double(3434.34));
	      hm.put("Mahnaz", new Double(123.22));
	      hm.put("Ayan", new Double(1378.00));
	      hm.put("Daisy", new Double(99.22));
	      hm.put("Qadir", new Double(-19.08));
	      
	      Set s=hm.entrySet();
	      
	      Iterator i=s.iterator();
	      while(i.hasNext()){
	    	  Map.Entry m=(Map.Entry)i.next();
	    	  
	    	  
	    	  System.out.println(m.getKey());
	    	  
	    	  
	      }
	      System.out.println();
	      
	      System.out.println(hm.get("zara"));
	      
	      
	      Set h=new HashSet();
	      
	      h.add("aaaa");
	      h.add("aaaa");
	      h.add("aaaa");
	      h.add("aaaa");
	      h.add("aaaba");
	      
	      
	      System.out.println(h);
	      
	}

}
