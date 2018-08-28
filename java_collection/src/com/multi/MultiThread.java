package com.multi;

public class MultiThread {

	/**
	 * @param args
	 */
	private class InnerClass extends Thread{
	private int threadMe;
	public InnerClass(int i){
		threadMe=i;
	}
	public void run(){
		for(int i=0;i<20;i++){
			System.out.println("This is thread "+threadMe+">>>"+i);
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	}
	public static void main(String[] args) {
		MultiThread mul=new MultiThread();
		for (int i=0;i<5;i++){
			InnerClass in=mul.new InnerClass(i);
			new Thread(in).start();
			
		}

	}

}
