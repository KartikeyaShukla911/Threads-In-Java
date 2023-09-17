package com.demo.common;

public class LoopValueA implements Runnable {

	private static int id=0;
	private int a;
	private int b;
	private int sum;
	private volatile boolean done=false;
	
	@Override
	public void run() {
		System.out.println("[" + "Thread "+id + "Started .....");
		
		sum = a + b;
		
		synchronized(this)
		{
			
		}
		
	}

	public int getSum()
	{
		return this.sum;
	}
	
	public LoopValueA(int a,int b)
	{
		this.a = a;
		this.b = b;
		++this.id;
	}
}

