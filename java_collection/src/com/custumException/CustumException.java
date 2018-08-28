package com.custumException;

public class CustumException {

	public static void main(String[] args) throws Exception {
		try {
			int a= 0;
			a = 2 /a;
			throw new MyException("My exception sdasdsd");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
