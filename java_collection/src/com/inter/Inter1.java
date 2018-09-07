package com.inter;

public class Inter1 implements InterfaceTest, Interface2{
	
	
	public static void main(String[] args) {
		InterfaceTest inn=new Inter1();
		
		inn.Test();
		Runnable r = () -> {
			System.out.println("sdsdf"); ;
		};
		String str = "knowledge";
		String s = str;
		str = str.concat(" base");
		System.out.println(s + str);
		
		//String t=new String();
		
		//int i = 21;
		 
        //overloadedMethod(i);
		
		
	}
	static void overloadedMethod(Integer I)
    {
        System.out.println("Integer Wrapper Class Type");
    }
 
    static void overloadedMethod(long L)
    {
        System.out.println("Long Wrapper Class Type");
    }

	@Override
	public void Test() {
		// TODO Auto-generated method stub
		//Interface2.super.Test();
		InterfaceTest.super.Test();
	}
	@Override
	public void Test(int u) {
		// TODO Auto-generated method stub
		
	}

}
