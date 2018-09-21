package com.singleton;

import java.io.Serializable;

public class SinngleTonTest implements Serializable,Cloneable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static SinngleTonTest sinngleTonTest;
	
	private SinngleTonTest() {
		
	}
	
	public SinngleTonTest getInstance() {
		if(sinngleTonTest == null)
			sinngleTonTest = new SinngleTonTest();
		
		return sinngleTonTest;
	}
	
	public Object readResolve() {
		return sinngleTonTest;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
}
