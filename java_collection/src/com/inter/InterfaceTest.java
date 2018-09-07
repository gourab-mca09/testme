package com.inter;

import com.abst.override;

public interface InterfaceTest {
	
	 default public void Test(){ System.out.println("default1"); };
	 
	 static public void TestStat(){ System.out.println("static"); };
}
